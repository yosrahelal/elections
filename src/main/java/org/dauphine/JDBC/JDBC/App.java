package org.dauphine.JDBC.JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
//test 
public class App {
	public static void main(String[] args) {

		Driver driver = null;

		try {

			driver = (Driver) DriverManager.getDriver("jdbc:h2:~/test");

			System.out.println(
					"driver pilote version number = " + " " + driver.getMajorVersion() + "." + driver.getMinorVersion());

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}
	}
}
