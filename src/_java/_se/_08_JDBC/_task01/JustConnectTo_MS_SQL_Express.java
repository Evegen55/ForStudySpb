/**
 * 
 */
package _java._se._08_JDBC._task01;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerConnectionPoolDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

/**
 * @author Lartsev
 *
 */
public class JustConnectTo_MS_SQL_Express {
	
	private String query;
	private String preparedQuery;
	private String deleteQuery;
	
	
	/**
	 * @param query
	 * @param preparedQuery
	 * @param deleteQuery
	 */
	public JustConnectTo_MS_SQL_Express(String query, String preparedQuery, String deleteQuery) {
		this.query = query;
		this.preparedQuery = preparedQuery;
		this.deleteQuery = deleteQuery;
	}
	
	
	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}


	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}


	/**
	 * @return the preparedQuery
	 */
	public String getPreparedQuery() {
		return preparedQuery;
	}


	/**
	 * @param preparedQuery the preparedQuery to set
	 */
	public void setPreparedQuery(String preparedQuery) {
		this.preparedQuery = preparedQuery;
	}


	/**
	 * @return the deleteQuery
	 */
	public String getDeleteQuery() {
		return deleteQuery;
	}


	/**
	 * @param deleteQuery the deleteQuery to set
	 */
	public void setDeleteQuery(String deleteQuery) {
		this.deleteQuery = deleteQuery;
	}


	public void MyQuery(){
		
		//String connectionUrl = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS:1433;databaseName=paymentsDB_v_1_3_SQLExpress;integratedSecurity=true;";
		//Create connection poll using library by Microsoft
		SQLServerConnectionPoolDataSource sds = new SQLServerConnectionPoolDataSource();
		
		sds.setServerName("127.0.0.1");
		sds.setInstanceName("SQLEXPRESS");
        sds.setPortNumber(1433);
        sds.setDatabaseName("paymentsDB_v_1_3_SQLExpress");
        sds.setUser("sa");
        sds.setPassword("qwerty");
        sds.setIntegratedSecurity(false);
        sds.setDescription("just try it!");
        
        try(Connection con = sds.getConnection()) {
        	
        	//switch off autocommit mode
        	con.setAutoCommit(false);
        	
        	//create and execute query
        	PreparedStatement stmt = con.prepareStatement(preparedQuery);
        	stmt.setInt(1, 2);
        	ResultSet rs = stmt.executeQuery();
        	
        	//commit transaction
        	con.commit();
        	
        	//show result executed query
        	while (rs.next()) {
                System.out.println(rs.getString(1).trim() 
                		+"\t"+ rs.getString(2) 
                		+"\t"+ rs.getString(3) 
                		+"\t"+ rs.getString(4)
                		);
            }
        	
        	//turns off the transaction.
        	stmt.close(); 
        	System.out.println("============================================");
        	//create and execute query
        	Statement stmt1 = con.createStatement();
        	ResultSet rs1 = stmt1.executeQuery(query);
        	
        	//commit transaction
        	con.commit();
        	
        	//show result executed query
        	while (rs1.next()) {
                System.out.println(rs1.getString(1).trim() 
                		+"\t"+ rs1.getString(2).trim() 
                		+"\t"+ rs1.getString(3).trim() 
                		+"\t"+ rs1.getString(4).trim()
                		);
            }
        	
        	//turns off the transaction.
        	stmt1.close();
        	
        	System.out.println("============================================");
        	//create and execute query
        	Statement stmt2 = con.createStatement();
        	boolean rs2 = stmt2.execute(deleteQuery);
        	
        	//commit transaction
        	con.commit();
        	
        	//read some database meta
        	DatabaseMetaData dmd = con.getMetaData();
            System.out.println(dmd.getDatabaseProductName()
            		+"\n" + dmd.getDatabaseProductVersion()
            		+"\n" + dmd.getDefaultTransactionIsolation()
            		+"\n" + dmd.getDriverVersion()
            		+"\n" + dmd.getSQLKeywords()
            		+"\n" + dmd.getURL()
            		);
        } catch (SQLServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String preparedQuery = "SELECT * FROM creditCards where client_ID = ?;";
		String query = "SELECT * FROM bankAccount;";
		String queryDelete = "drop table clients_groups;";
		
		JustConnectTo_MS_SQL_Express c = new JustConnectTo_MS_SQL_Express(query, preparedQuery, queryDelete);
		c.MyQuery();
	}

}
