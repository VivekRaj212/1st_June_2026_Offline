package finance.oneloan;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) {
		
		String driverClass = args[0];
		OrderHistory history = new OrderHistory(); // you have decided(at the time of compilation) that OrderHistory class will be loaded 
		OrderManagement management = new OrderManagement();
		try
		{
		//	history.getOrderHistory(driverClass);
			for (int i = 0; i < 20; i++) {
			//	management.updateOrder("1003"+i, "CANCELLED");
			}
		//	management.updateOrder("1003", "CANCELLED");
			management.bulkOrderUpdate(10001, "CANCELLED");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
