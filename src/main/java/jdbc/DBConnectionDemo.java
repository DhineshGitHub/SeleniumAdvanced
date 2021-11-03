package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DataDase{
	public void MySqlConnection() throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost/test";
		String username = "root";
		String password = "";
		String query = "Select * from student";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String RollNo = rs.getString(1);
			String Name = rs.getString(1);
			String Phone = rs.getString(2);
			String DOB = rs.getString(4);

			System.out.println("Roll NO : " + RollNo);
			System.out.println("Name Of Student : " + Name);
			System.out.println("Student Phone Number : " + Phone);
			System.out.println("Date Of Birth : " + DOB);
			System.out.println("*********************************");
		}
	}
}

public class DBConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DataDase db = new DataDase();
		db.MySqlConnection();

	}

}
