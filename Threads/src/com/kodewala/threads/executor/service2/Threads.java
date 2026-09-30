package com.kodewala.threads.executor.service2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Boolean> {
	EmailSender emailSender;

	Task(EmailSender _emailSender) {
		this.emailSender = _emailSender;
	}

	@Override
	public Boolean call() {
		System.out.println(" Executing call()");
		return emailSender.sendEmail(emailSender.email, emailSender.body);
	}
}

public class Threads {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(" Main - START");
		// Executor Service

		ExecutorService ex = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			EmailSender emailSender = new EmailSender("Kodewala@gmail.com_" + i, "This is email body" + i);
			Task task = new Task(emailSender);

			Future<Boolean> future = ex.submit(task);
			System.out.println("email status is : " + future.get());
		}
		System.out.println(" Main - END");

	}

}
