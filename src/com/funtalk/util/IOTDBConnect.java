package com.funtalk.util;
 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.sql.Types;

public class IOTDBConnect {

	public Connection conn = null;   
	private Statement st = null;
	private String dbtype = "jdbc:mysql://";
	private String dbIP = "172.31.2.122"; 	 
	private String dbPort = ":3306/";
	private String dbsid = "iot?";
	private String dbuser = "iotuser";
	private String dbpass = "111111";
	private String lastStr = "&useUnicode=true&characterEncoding=UTF8";
	private String dburl = "";
	private String driverStr = "com.mysql.jdbc.Driver";
	 
	public IOTDBConnect(){
		dburl = dbtype + dbIP + dbPort + dbsid + "user=" + dbuser + "&password=" + dbpass + lastStr; 	 
		try {
			Class.forName( driverStr );
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}	
		 try {
			this.conn = DriverManager.getConnection( dburl );
			// conn.setAutoCommit(false);
		} catch (SQLException e) { 
			e.printStackTrace();
		} 
	} 
	
	public ResultSet getData(String sql)
	{  
		Connection con = this.conn;
		ResultSet rs = null;    
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);  
		} catch (SQLException e1) { 
			e1.printStackTrace(); }   
		return rs; 
	}
	
	public String updateData(String sql)
	{  
		Connection con = this.conn;   
		try { 
			con.prepareStatement(sql).executeUpdate();  
		} catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e){
			// e.printStackTrace();
			return "2000";
		} catch(com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException e){
			return "9000";
		} catch (SQLException e1) {  
			e1.printStackTrace(); 
			return "9999";
		}

		return "0000"; 
	}  
    
	public void commit()	{
		try { this.conn.commit(); } 
		catch (SQLException e) { e.printStackTrace(); }
	}
	
	public void autocommit(boolean set){
		try { this.conn.setAutoCommit(set); } 
		catch (SQLException e) { e.printStackTrace(); }
	}
	
	public void rollback()	{
		try { this.conn.rollback(); } 
		catch (SQLException e) { e.printStackTrace(); }
	}
	
	public void close()  {
		try {   
			if(this.st!=null){
				this.st.close();
			} 
			this.conn.close(); 
			} 
		catch (SQLException e) {  e.printStackTrace(); }  
	}

	public Connection getConn() {
		return conn;
	} 
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public String exec_proc(String functionName, String params)
	{
		String result = null;
		Connection con = null; 
		CallableStatement proc = null;  
		con = getConn();   
	    try {
			proc = con.prepareCall( "{ call "+functionName+"(?) }"); 
		    proc.execute();	
		    proc.registerOutParameter(1, Types.VARCHAR);	//
		    result = proc.getString(1);
		} catch (SQLException e) { 
			e.printStackTrace();
		}  
		return result;
	} 
	 
	
}
