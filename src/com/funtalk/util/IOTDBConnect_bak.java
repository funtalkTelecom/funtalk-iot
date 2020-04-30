package com.funtalk.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IOTDBConnect_bak {


	private static ComboPooledDataSource dataSource;

	static {

		try   {

			dataSource=new  ComboPooledDataSource();
			dataSource.setUser( "iotuser");
			dataSource.setPassword("111111");
			dataSource.setJdbcUrl( "jdbc:mysql://172.31.2.122:3306/iot?useUnicode=true&characterEncoding=UTF8");
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setInitialPoolSize(10);
			dataSource.setMinPoolSize(10);
			dataSource.setMaxPoolSize(50);
			dataSource.setMaxStatements(50);
			dataSource.setMaxIdleTime(60);

		}   catch   (PropertyVetoException e)   {
			throw   new   RuntimeException(e);
		}
	}



	public static Connection   getConnection(){

		try   {

			return   dataSource.getConnection();

		}   catch   (SQLException   e)   {
			throw   new   RuntimeException( "无法从数据源获取连接 ",e);
		}

	}




	public ResultSet getData(Connection conn,String sql)
	{

		ResultSet rs = null;
		Statement st = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

		} catch (SQLException e1) {
			e1.printStackTrace();
		}


		return rs;
	}

	public String updateData(Connection conn,String sql)
	{
		try {
			conn.prepareStatement(sql).executeUpdate();

			conn.close();
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




	public static ComboPooledDataSource getDataSource() {
		return dataSource;
	}

	public static void setDataSource(ComboPooledDataSource dataSource) {
		IOTDBConnect_bak.dataSource = dataSource;
	}



}
