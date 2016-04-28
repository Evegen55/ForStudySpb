/**
 *
 */
package _java._se._08_JDBC._connection_pool_example;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executor;

/**
 * @author
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
			e.printStackTrace();
		} catch (SQLException e) {
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


	/**
	 *
	 * @author
	 *
	 */
	private class PooledConnection implements Connection {

		private Connection con;

		public PooledConnection(Connection con) throws SQLException {
			this.con = con;
			this.con.setAutoCommit(true);
		}

		@Override
		public boolean isWrapperFor(Class<?> arg0) throws SQLException {
			return con.isWrapperFor(arg0);
		}

		@Override
		public <T> T unwrap(Class<T> arg0) throws SQLException {
			return con.unwrap(arg0);
		}

		@Override
		public void abort(Executor executor) throws SQLException {
			con.abort(executor);

		}

		@Override
		public void clearWarnings() throws SQLException {
			con.clearWarnings();

		}

		@Override
		public void close() throws SQLException {
			if (con.isClosed()) {
				throw new SQLException("Attempting to close closed connection");
			}

			if (con.isReadOnly()) {
				con.setReadOnly(false);
			}

			if (!givenAvayConnectionQueue.remove(this)) {
				throw new SQLException("Error deleting connection from the given avay connections pool");
			}

		}

		@Override
		public void commit() throws SQLException {
			con.commit();

		}

		@Override
		public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
			return con.createArrayOf(typeName, elements);
		}

		@Override
		public Blob createBlob() throws SQLException {
			// TODO Auto-generated method stub
			return con.createBlob();
		}

		@Override
		public Clob createClob() throws SQLException {
			return con.createClob();
		}

		@Override
		public NClob createNClob() throws SQLException {
			return con.createNClob();
		}

		@Override
		public SQLXML createSQLXML() throws SQLException {
			return con.createSQLXML();
		}

		@Override
		public Statement createStatement() throws SQLException {
			return con.createStatement();
		}

		@Override
		public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
			return con.createStatement(resultSetType, resultSetConcurrency);
		}

		@Override
		public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
				throws SQLException {
			return con.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
		}

		@Override
		public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
			return con.createStruct(typeName, attributes);
		}

		@Override
		public boolean getAutoCommit() throws SQLException {
			return con.getAutoCommit();
		}

		@Override
		public String getCatalog() throws SQLException {
			return con.getCatalog();
		}

		@Override
		public Properties getClientInfo() throws SQLException {
			return con.getClientInfo();
		}

		@Override
		public String getClientInfo(String name) throws SQLException {
			return con.getClientInfo(name);
		}

		@Override
		public int getHoldability() throws SQLException {
			return con.getHoldability();
		}

		@Override
		public DatabaseMetaData getMetaData() throws SQLException {
			return con.getMetaData();
		}

		@Override
		public int getNetworkTimeout() throws SQLException {
			return con.getNetworkTimeout();
		}

		@Override
		public String getSchema() throws SQLException {
			return con.getSchema();
		}

		@Override
		public int getTransactionIsolation() throws SQLException {
			return con.getTransactionIsolation();
		}

		@Override
		public Map<String, Class<?>> getTypeMap() throws SQLException {
			return con.getTypeMap();
		}

		@Override
		public SQLWarning getWarnings() throws SQLException {
			return con.getWarnings();
		}

		@Override
		public boolean isClosed() throws SQLException {
			return con.isClosed();
		}

		@Override
		public boolean isReadOnly() throws SQLException {
			return con.isReadOnly();
		}

		@Override
		public boolean isValid(int timeout) throws SQLException {
			return con.isValid(timeout);
		}

		@Override
		public String nativeSQL(String sql) throws SQLException {
			return con.nativeSQL(sql);
		}

		@Override
		public CallableStatement prepareCall(String sql) throws SQLException {
			return con.prepareCall(sql);
		}

		@Override
		public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
			return con.prepareCall(sql, resultSetType, resultSetConcurrency);
		}

		@Override
		public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
				int resultSetHoldability) throws SQLException {
			return con.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
		}

		@Override
		public PreparedStatement prepareStatement(String sql) throws SQLException {
			return con.prepareStatement(sql);
		}

		@Override
		public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
			return con.prepareStatement(sql, autoGeneratedKeys);
		}

		@Override
		public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
			return con.prepareStatement(sql, columnIndexes);
		}

		@Override
		public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
			return con.prepareStatement(sql, columnNames);
		}

		@Override
		public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
				throws SQLException {
			return con.prepareStatement(sql, resultSetType, resultSetConcurrency);
		}

		@Override
		public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
				int resultSetHoldability) throws SQLException {
			return con.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
		}

		@Override
		public void releaseSavepoint(Savepoint savepoint) throws SQLException {
			con.releaseSavepoint(savepoint);

		}

		@Override
		public void rollback() throws SQLException {
			con.rollback();

		}

		@Override
		public void rollback(Savepoint savepoint) throws SQLException {
			con.rollback(savepoint);

		}

		@Override
		public void setAutoCommit(boolean autoCommit) throws SQLException {
			con.setAutoCommit(autoCommit);

		}

		@Override
		public void setCatalog(String catalog) throws SQLException {
			con.setCatalog(catalog);

		}

		@Override
		public void setClientInfo(Properties properties) throws SQLClientInfoException {
			con.setClientInfo(properties);

		}

		@Override
		public void setClientInfo(String name, String value) throws SQLClientInfoException {
			con.setClientInfo(name, value);

		}

		@Override
		public void setHoldability(int holdability) throws SQLException {
			con.setHoldability(holdability);

		}

		@Override
		public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
			con.setNetworkTimeout(executor, milliseconds);

		}

		@Override
		public void setReadOnly(boolean readOnly) throws SQLException {
			con.setReadOnly(readOnly);

		}

		@Override
		public Savepoint setSavepoint() throws SQLException {
			return con.setSavepoint();
		}

		@Override
		public Savepoint setSavepoint(String name) throws SQLException {
			return con.setSavepoint(name);
		}

		@Override
		public void setSchema(String schema) throws SQLException {
			con.setSchema(schema);

		}

		@Override
		public void setTransactionIsolation(int level) throws SQLException {
			con.setTransactionIsolation(level);

		}

		@Override
		public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
			con.setTypeMap(map);

		}

		public void reallyClose() throws SQLException {
			con.close();
		}

	}

}
