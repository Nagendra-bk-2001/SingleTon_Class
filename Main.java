package com.singletonclass;
//WAP class Name as prime minister of india we have to [pass one attribute 

//create a one helper method and follow the rule to achive the class

// WAQ create another class 

class PrimeMinister
{
	 static  String s1 = "Narendra Modi";
	private static PrimeMinister pc;
	
	private PrimeMinister()
	{
		System.out.println("Indian Prime Ministeris  got elected ");
	}

	
	public static PrimeMinister  CreatePmIndia()
	{
		if(pc == null)
		{
			pc = new PrimeMinister();
//			System.out.println(s1);
			return pc;
		}
		else
		{
			
		}
		return pc;
	}
}
public class Main {
	
	public static void main(String[] args)
	{
		
		PrimeMinister  p = PrimeMinister.CreatePmIndia();
		System.out.println(p.s1);
		PrimeMinister.CreatePmIndia();
		
	}

}
