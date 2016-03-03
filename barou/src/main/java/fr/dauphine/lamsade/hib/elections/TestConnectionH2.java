package fr.dauphine.lamsade.hib.elections;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectionH2 {
	private final String URL = "jdbc:h2:localhost/test";

	public TestConnectionH2() {
		try {
			Driver driver = DriverManager.getDriver(URL);
			System.out.println("H2 pilote JDBC version: "
					+ driver.getMajorVersion() + "."
					+ driver.getMinorVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TestConnectionH2();

	}

	private Connection getH2Connection() throws SQLException {
		return DriverManager.getConnection(URL, "sa", "");
	}

}
