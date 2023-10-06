package eightaugust;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\Scanner in =
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("enter the value");
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
				break;
			}
				
		}
		if(isprime) {
			System.out.println("it is prime");
		}
		

	}

}
