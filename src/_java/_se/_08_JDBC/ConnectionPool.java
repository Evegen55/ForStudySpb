/**
 *
 */
package _java._se._08_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;

/**
 * @author Lartsev
 *
 */
public final class ConnectionPool {
	private BlockingDeque<Connection> connectionQueue;
	private BlockingDeque<Connection> givenAvayConnectionQueue;

	private String driverName;
	private String url;
	private String user;
	private String password;
	private int poolsize;

	private ConnectionPool() {
		DBResourceManager dBResourceManager = DBResourceManager.getInstance();
		this.driverName = dBResourceManager.getBundle(DBParameter.DB_DRIVER);
		this.url = dBResourceManager.getBundle(DBParameter.DB_URL);
		this.user = dBResourceManager.getBundle(DBParameter.DB_USER);
		this.password = dBResourceManager.getBundle(DBParameter.DB_PASSWORD);
		try {
			this.poolsize = Integer.parseInt(dBResourceManager.getBundle(DBParameter.DB_POOLSIZE));
		} catch (NumberFormatException e) {
			this.poolsize = 5;
		}
	}

	public void initPoolData() {
		Locale.setDefault(Locale.ENGLISH);

		try {
			Class.forName(driverName);
			givenAvayConnectionQueue = (BlockingDeque<Connection>) new ArrayBlockingQueue<Connection>(poolsize);
			connectionQueue = (BlockingDeque<Connection>) new ArrayBlockingQueue<Connection>(poolsize);

			for(int i = 0; i < poolsize; i++) {
				Connection con = DriverManager.getConnection(url, user, password);
				PooledConnection pc = new PooledConnection(con);
				connectionQueue.add(pc);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dispose() {
		clearConnectionQueue();
	}

	private void clearConnectionQueue() {
		try {
			closeConnectionQueue(givenAvayConnectionQueue);
			closeConnectionQueue(connectionQueue);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void closeConnectionQueue(BlockingDeque<Connection> connectionQueue2) throws SQLException {
		Connection con;
		while ((con = connectionQueue2.poll()) != null) {
			if (!con.getAutoCommit()) {
				con.commit();
			}
			((PooledConnection) con).reallyClose();
		}

	}

	public Connection takeConnection() throws ConnectionPoolException {
		Connection con = null;
		try {
			con = connectionQueue.take();
			givenAvayConnectionQueue.add(con);
		} catch (InterruptedException e) {
			throw new ConnectionPoolException("Error connecting to the data source", e);
		}
		return con;
	}

	public void closeConnection(Connection con, Statement st, ResultSet rs){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeConnection(Connection con, Statement st){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
