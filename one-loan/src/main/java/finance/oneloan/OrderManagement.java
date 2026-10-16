package finance.oneloan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderManagement {

	public void bulkOrderUpdate(int id, String status) throws ClassNotFoundException, SQLException {

		// 1. Register the Driver(Optional) --> dynamic class loading

		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading

		// 2. Create the connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/1st_june_2026", "root",
				"Test@12345");

		// 3. Create Statement

		// Statement stmt = connection.createStatement();

	//	String query = "update order_history set status=? where id = ? "; // static --> compiled once and will be reused

		String query = "insert into order_history(id, item, price, status) values(?,?,?,?)";
		
		PreparedStatement pstmt = connection.prepareStatement(query);

		int batchSize = 10;
        System.out.println(id);
		for (int i = 1; i < 96; i++) {

			pstmt.setInt(1, id+i);
			pstmt.setString(2, "Iphone" );
			pstmt.setInt(3, 2345);
			pstmt.setString(4, status );
			pstmt.addBatch();
			
			if (i % batchSize == 0) 
			{
				System.out.println(" Adding to batch... "+i);
				
				int[] records =  pstmt.executeBatch(); // 9 times
			}

		}
		// add the remaining 
		//pstmt.addBatch();
		
		pstmt.executeBatch(); // one time
	}

	public void updateOrder(String id, String status) throws ClassNotFoundException, SQLException {

		// 1. Register the Driver(Optional) --> dynamic class loading

		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading

		// 2. Create the connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/1st_june_2026", "root",
				"Test@12345");

		// 3. Create Statement

		// Statement stmt = connection.createStatement();

		String query = "update order_history set status=? where id = ? "; // static --> compiled once and will be reused

		PreparedStatement pstmt = connection.prepareStatement(query);

		// set the values dynamically
		pstmt.setString(1, status);
		pstmt.setString(2, id);

		// 4. execute the query
		System.out.println(query);
		int noOfRecordsUpdated = pstmt.executeUpdate();

		System.out.println(" Total Record update : " + noOfRecordsUpdated);

	}

}
