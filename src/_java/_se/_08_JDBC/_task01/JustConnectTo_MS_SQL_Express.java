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

	public void MyQuery(){
		
		//String connectionUrl = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS:1433;databaseName=paymentsDB_v_1_3_SQLExpress;integratedSecurity=true;";
		//Create connection poll using library by Microsoft
		SQLServerConnectionPoolDataSource sds = new SQLServerConnectionPoolDataSource();
		
		sds.setServerName("");
		sds.setInstanceName("SQLEXPRESS");
        sds.setPortNumber(1433);
        sds.setDatabaseName("paymentsDB_v_1_3_SQLExpress");
        sds.setUser("sa");
        sds.setPassword("qwerty");
        sds.setIntegratedSecurity(false);
        sds.setDescription("just try it!");
        
        try(Connection con = sds.getConnection()) {
        	//switch off autocommit
        	con.setAutoCommit(false);
        	
        	//create and execute query
        	PreparedStatement stmt = con.prepareStatement("SELECT * FROM creditCards;");
        	stmt.setString(1, "clientID");
        	ResultSet rs = stmt.executeQuery();
        	
        	//commit transaction
        	con.commit();
        	
        	//show result executed query
        	while (rs.next()) {
                System.out.println(rs.getString(1).trim() +"\t"+ rs.getString(2) +"\t"+ rs.getString(3) +"\t"+ rs.getString(4) );
            }
        	
        	//turns off the transaction.
        	stmt.close(); 
        	
        	//read some database meta
        	DatabaseMetaData dmd = con.getMetaData();
            System.out.println(dmd.getDatabaseProductName());
            System.out.println(dmd.getDatabaseProductVersion());
            System.out.println(dmd.getDefaultTransactionIsolation());
            System.out.println(dmd.getDriverVersion());
            System.out.println(dmd.getSQLKeywords()+"\n");
            System.out.println(dmd.getURL()+"\n");
            
        	
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
		JustConnectTo_MS_SQL_Express c = new JustConnectTo_MS_SQL_Express();
		c.MyQuery();

	}

}
