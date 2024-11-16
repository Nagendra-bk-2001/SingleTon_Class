package com.singletonclass;

class Account 
{
	static Account obj = null;
	private void  Account()
	{
		System.out.println("Account  New Create ");
	}
	
	public static  void createObj()
	{
		if(obj == null)
		{
			obj = new Account();
			
			System.out.println("Account created ");
		}
		else
		{
			System.out.println("Account not created bcz Already we have account");
			
		}
		
	}
	
	
}

public class User {

	public static void main(String[] args) {
		
		Account.createObj();
		Account.createObj();

	}

}
