package com.kodewala.threads.executor.service2;

public class EmailSender {
	String email;
	String body;

	public EmailSender(String email, String body) {
		super();
		this.email = email;
		this.body = body;
	}

	public boolean sendEmail(String _email, String _body) {
		System.out.println("Sending email to " + _email + " ["+Thread.currentThread().getName()+"]");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
