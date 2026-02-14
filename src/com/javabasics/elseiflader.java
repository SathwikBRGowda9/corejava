package com.javabasics;

public class elseiflader {
	public static void main(String[] args) {
		
		int age = 18;

		if(age >= 18 && age <= 22)
		{
		    System.out.println("eligible for marriage");
		}
		else if(age <= 22) {
		    System.out.println("have some patience come when you ?");
		}
		else
		{
		    System.out.println("you have lot of patience try your back");
		}
		
		int num = 20;

		if (num < 18) {
		    System.out.println("In the Range");
		}
		else if (num >= 18 && num <= 22) {
		    System.out.println("Below the Range");
		}
		else {
		    System.out.println("Above thr Range");
		}
		
		
		
		//other example program 
		
		int vote= 18;

		if(vote >= 18)
		{
		    System.out.println("Eligible for Voting");
		}
		else
		{
		    System.out.println("Not Eligible for Voting");
		}


		// Another Example with Range

		int numm = 20;

		if (numm < 18) {
		    System.out.println("Not Eligible for Voting");
		}
		else if (numm>= 18 && numm <= 100) {
		    System.out.println("Eligible for Voting");
		}
		else {
		    System.out.println("Invalid Age");
		}



	}

}
