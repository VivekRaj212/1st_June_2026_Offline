package finance.oneloan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderManagement {

	public void updateOrder(String id, String status) throws ClassNotFoundException, SQLException {

		// 1. Register the Driver(Optional) --> dynamic class loading

		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading

		// 2. Create the connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/1st_june_2026", "root",
				"Test@12345");

		// 3. Create Statement

		Statement stmt = connection.createStatement();

		String query = "update order_history set status='" + status + "' where id ="+id;
		// 4. execute the query
		int noOfRecordsUpdated =  stmt.executeUpdate(query);
		
		System.out.println(" Total Record update : "+noOfRecordsUpdated );
		
	}

}
