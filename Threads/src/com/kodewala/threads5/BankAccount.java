package com.kodewala.threads5;

public class BankAccount {

	private int balance = 1000;

	public  void transfer(BankAccount receiver, int amount) { // 200 lines

		System.out.println("[" + Thread.currentThread().getName()
				+ "] 20 lines code - Sending email notification .... requested the fund transfer");

		synchronized (this) { // better performance
			if (balance >= amount) {
				System.out.println("[" + Thread.currentThread().getName() + "] checked balance: " + balance);
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - amount;
				receiver.balance = receiver.balance + amount;
				System.out.println("[" + Thread.currentThread().getName() + "] transferred " + amount);
			} else {
				System.out.println("[" + Thread.currentThread().getName() + "] Insufficient Balance");
			}

		}
		System.out.println(" 20 lines code - Sending email notification .... completed the fund transfer");
	}

	public int getBalance() {
		return balance;
	}

}
