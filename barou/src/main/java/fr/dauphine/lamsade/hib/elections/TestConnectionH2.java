package fr.dauphine.lamsade.hib.elections;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class TestConnectionH2 {
	private final String URL = "jdbc:h2:localhost/test";
	
	private static final Logger logger=Logger.getLogger(TestConnectionH2.class.getCanonicalName());

	public TestConnectionH2() {
		try {
			logger.info("Demarrage");
			Driver driver = DriverManager.getDriver(URL);
			logger.info("H2 pilote JDBC version: "
					+ driver.getMajorVersion() + "."
					+ driver.getMinorVersion());
		} catch (SQLException e) {
			logger.severe(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new TestConnectionH2();

	}

}
