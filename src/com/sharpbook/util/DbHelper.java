package com.sharpbook.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DbHelper {
	protected Connection connection=null;
	protected PreparedStatement pstate=null;
	protected ResultSet rSet=null;
	
	public  void dbConnections() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bwfbook", "root", "1234");
			
		} catch (ClassNotFoundException e) {
				throw new RuntimeException("这里有一个ClassNOtFoundException："+e);
			
		} catch (SQLException e) {
			throw new RuntimeException("这里有一个SQLException"+e);
		}
	}
	public void close() {
		if(rSet!=null) {
			try {
				rSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstate!=null) {
			try {
				pstate.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
