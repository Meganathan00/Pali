package org.palin;

public class Palindrome2
{

	public static void main(String[] args)
	{
		for(int num=0;num<=1000;num++)
		{
			int temp=num;
			int rev=0;
			
			while(temp>0) {
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(num==rev) {
				System.out.println(rev);
			}
		}

	}

}
