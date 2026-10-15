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
			management.updateOrder("1003", "CANCELLED");
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
