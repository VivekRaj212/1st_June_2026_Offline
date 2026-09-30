package com.kodewala.thread.test;



public class Driver 
{
    // Work OR Task
	public String doSomething(int amount)
	{
		if(amount > 0)
		{
			return "SUCCESS";
		}
		else
		{
			return "FAILED";
		}
	}
	
	
	public static void main(String[] args) 
	{
		Driver driver = new Driver();
		String response = driver.doSomething(200);
        
		System.out.println(response);
		
		
	}

}
