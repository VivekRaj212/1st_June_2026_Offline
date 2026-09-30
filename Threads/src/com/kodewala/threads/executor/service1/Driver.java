package com.kodewala.threads.executor.service1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
	int taskId;

	@Override
	public void run() {
		System.out.println("MyThread.run().... task is "+taskId + " : [" + Thread.currentThread().getName() + "]");
	}

	public MyThread(int taskId) {
		this.taskId = taskId;
	}
}

public class Driver {

	public static void main(String[] args) {
		// We are going to use executor service.

		ExecutorService executorService = Executors.newFixedThreadPool(2); // pool of 2 threads

		// executing 10 tasks
		for (int i = 0; i < 40; i++)
		{
			MyThread task = new MyThread(i);
			executorService.execute(task);
		}
		executorService.shutdown();
	}

}
