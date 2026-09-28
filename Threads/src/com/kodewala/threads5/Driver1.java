package com.kodewala.threads5;

class Task {
	public void doSomething() {
		System.out.println("Task.doSomething()" + "[ " + Thread.currentThread().getName() + "]");
		
		try {
			// TIMED_WAITING
			Thread.sleep(1000); // Current thread will sleep for 5 sec.
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doNothing()
	{

		System.out.println("Task.doNothing()" + "[ " + Thread.currentThread().getName() + "]");
		
		try {
			Thread.sleep(1000); // hold the object lock and goes to waiting. no other thread will be able to execute
			// TIMED_WAITING
		//	wait(1000); // Moves the current thread to waiting state
			
			for (int i = 0; i < 10; i++) {
				System.out.println(" Printing : "+i + " : [ " + Thread.currentThread().getName() + "]");
			
				Thread.yield();  
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}

class MyThread extends Thread

{
	Task task;

	public MyThread(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		System.out.println("MyThread.run()...... " + "[ " + Thread.currentThread().getName() + "]");
		task.doSomething();
		task.doNothing();
	}
}

public class Driver1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Driver1.main() START" + "[ " + Thread.currentThread().getName() + "]");

		Task task = new Task();

		MyThread t1 = new MyThread(task);
		t1.start();
     
		MyThread t2 = new MyThread(task);
		t2.start();
		
		t1.join(); // main thread join the t1 and will wait till t1 completes the execution.
		t2.join();
		
		System.out.println("Driver1.main() END" + "[ " + Thread.currentThread().getName() + "]");
	}

}
