package com.kodewala.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args)  {

		// CF1
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 20;
		}).thenApplyAsync((n) ->

		{
			System.out.println(Thread.currentThread().getName());
			return n * 10;
		});
		
		// CF2
		
		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 30;
		}).thenApplyAsync((n) ->

		{
			System.out.println(Thread.currentThread().getName());
			return n * 10;
		});
		
		// Combine the result....
		
		
		CompletableFuture<Integer> finalCF =  cf2.thenCombineAsync(cf1, (a,b) -> a+b);
		

		System.out.println(finalCF.join());
		
		
		CompletableFuture.supplyAsync(() -> 20);
		CompletableFuture.runAsync(() -> System.out.println(" Task Completed"));
		
       
		
	}

}
