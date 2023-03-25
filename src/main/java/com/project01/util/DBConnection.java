package com.project01.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER_NAME = "skin_care";
	private static final String PASSWORD = "root";
	private static  Connection connection;
	//Readonly property/field
	public static Connection getConnection() throws SQLException {
		connection=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		return connection;
	}

}
