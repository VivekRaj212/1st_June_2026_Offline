package finance.fundtransfer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Banking {
	public void doTxn(String fromAcc, String toAcc, int txnAmt) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/1st_june_2026", "root",
				"Test@12345");

		connection.setAutoCommit(false); // Txn boundry stated
		
		try {
			String balanceQuery = "select balance from account where account_number =?";

			PreparedStatement ps = connection.prepareStatement(balanceQuery);

			ps.setString(1, fromAcc);

			ResultSet rs = ps.executeQuery();
			int senderBalance = 0;
			while (rs.next()) {
				senderBalance = rs.getInt(1);
			}

			System.out.println(" Balance for sender is : " + senderBalance);

			// debit
			String updateQuery = "UPDATE ACCOUNT SET BALANCE = ? WHERE ACCOUNT_NUMBER= ? ";
			ps = connection.prepareStatement(updateQuery);
			// updating the balance
			senderBalance = senderBalance - txnAmt;

			ps.setInt(1, senderBalance);
			ps.setString(2, fromAcc);

			int recordUpdated = ps.executeUpdate();

			if (recordUpdated >0) {
				System.out.println(" Balance updated for sender!!!");
				
				ps = connection.prepareStatement(balanceQuery);

				ps.setString(1, toAcc);

				 rs = ps.executeQuery();
				int recBalance = 0;
				while (rs.next()) {
					recBalance = rs.getInt(0); // 
				}

				System.out.println(" Balance for receiver is : " + recBalance);

				
				ps = connection.prepareStatement(updateQuery);
				// updating the balance
				recBalance = recBalance + txnAmt;

				ps.setInt(1, recBalance);
				ps.setString(2, toAcc);

				 recordUpdated = ps.executeUpdate();
				 
				 System.out.println(" Record updated.. "+ recordUpdated);
				
			}
			
			connection.commit(); // ENDED
		} 
		catch (SQLException e) 
		{
		    System.err.println(" There was an issue with txn.. doingh rollback");
			e.printStackTrace();
			connection.rollback();// rollback
		}


	}
}
