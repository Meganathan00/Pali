package org.palin;

public class Palindrome1 {

	public static void main(String[] args)
	{
		int num=15351;
		int temp=num;
		int rev=0;
		
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Its a palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
		System.out.println("Developed By Mega");

	}
}
