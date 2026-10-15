package finance.oneloan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderHistory {
	public void getOrderHistory(String _driverClass) throws SQLException, ClassNotFoundException {
		
		// 1. Register the Driver(Optional) --> dynamic class loading

		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading

		// 2. Create the connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/1st_june_2026", "root",
				"Test@12345");

		// 3. Create Statement

		Statement stmt = connection.createStatement();

		// 4. Execute Query
		String query = "select * from order_history";

		ResultSet rs = stmt.executeQuery(query); // query will be executed.

		while (rs.next()) {

			int id = rs.getInt(1);
			String item = rs.getString(2);
			int price = rs.getInt(3);
			String status = rs.getString(4);
			System.out.println("+++++++++++++++++++++++++++++++++++");
			System.out.println("ID: " + id);
			System.out.println("Item: " + item);
			System.out.println("Price: " + price);
			System.out.println("Status: " + status);
			
			System.out.println("+++++++++++++++++++++++++++++++++++");
		}

	}
}
