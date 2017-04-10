package com.kaishengit.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

public class DbHelp {
	
	private static Connection getConnection(){
		return ConnectionManager.getConnection();
	}
	
	public static void update(String sql, Object... params){
		Connection connection = getConnection();
		
		try {
			QueryRunner qr = new QueryRunner();
			qr.update(connection, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(connection);
		}
	}
	
	public static <T> T query(String sql,ResultSetHandler<T> rsh,Object... params){
		
		Connection connection = getConnection();
		
		try {
			QueryRunner qr = new QueryRunner();
			return qr.query(connection, sql, rsh, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(connection);
		}
		return null;
	}

	private static void close(Connection connection) {
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
