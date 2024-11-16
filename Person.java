package com.singletonclass;


class AadharCard
{
	private static AadharCard ac;
	
	private AadharCard()
	{
		System.out.println("Aadhar Card Number is 314337288061 ");
	}
	
	public static void CreateAadharCard()
	{
		if(ac == null)
		{
			
			ac = new AadharCard();
			
			System.out.println(ac);
		}
		else
		{
			System.out.println("We have Already AadharCard ");
		}
	
	}
}
public class Person {

	public static void main(String[] args) {
		
		AadharCard.CreateAadharCard();
		AadharCard.CreateAadharCard();

	}

}
