package fudandb;

import java.sql.*;

public class Connector {
	public Connection con;
	public Statement stmt;

	public Connector() throws Exception {
		try {
			
			String userName = "root";
			
			String password = "Mgahlot@2";
			String url = "jdbc:mysql://localhost:3306/bookstore?allowMultiQueries=true";
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url, userName, password);
			stmt = con.createStatement();
			// stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			// ResultSet.CONCUR_UPDATABLE);
		} catch (Exception e) {
			System.err
					.println("Unable to open mysql jdbc connection. The error is as follows,\n");
			System.err.println(e.getMessage());
			throw (e);
		}

	}

	public void closeConnection() throws Exception {
		con.close();
	}
}
