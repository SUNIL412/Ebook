package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	private static Connection conn;
	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook","root","SK@0D80144");
	}catch(Exception e) {
		e.printStackTrace();
	}
		return conn;

}
}
