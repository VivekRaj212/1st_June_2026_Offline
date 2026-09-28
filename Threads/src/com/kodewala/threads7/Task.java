package com.kodewala.threads7;

import java.util.concurrent.locks.ReentrantLock;

public class Task {
	
	ReentrantLock lock = new ReentrantLock();
	
	public  void doSomething() throws InterruptedException {
		
		
		lock.lock();
		for (int i = 0; i < 10; i++) {

			System.out.println("Task.doSomething() [" + Thread.currentThread().getName() + "] and " + i);

		}
		lock.unlock();
		
		
		for (int i = 0; i < 10; i++) {

			System.out.println("Task.doSomething() [" + Thread.currentThread().getName() + "] and " + i);

		}
		
		
		lock.lock();
		for (int i = 0; i < 10; i++) {

			System.out.println("Task.doSomething() [" + Thread.currentThread().getName() + "] and " + i);

		}
		lock.unlock();
		
		
	}

}
