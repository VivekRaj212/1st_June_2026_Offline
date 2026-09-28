package com.kodewala.threads7;

class MyThread extends Thread {
	com.kodewala.threads7.Task task;

	public MyThread(com.kodewala.threads7.Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		task.doSomething();
	}
}

public class Driver {

	public static void main(String[] args) {
		Task task = new Task();
		MyThread t1 = new MyThread(task);

		t1.start();

		MyThread t2 = new MyThread(task);

		t2.start();
	}

}
