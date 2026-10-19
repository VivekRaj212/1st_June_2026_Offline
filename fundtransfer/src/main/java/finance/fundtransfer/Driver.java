package finance.fundtransfer;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Banking banking = new Banking();
		banking.doTxn("1234567890", "987654321", 100);
	}

}
