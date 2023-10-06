package eightaugust;

import java.util.Scanner;

public class Prm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n =new Scanner(System.in);
		System.out.println("pls enter value");
		int input=n.nextInt();
		
		boolean isit=false;
		
		for(int i=2;i<=input/2;i++)
		{
			
			if(input%i==0)
			{
				isit=true;
				break;
			}
			
		}
		if(!isit)
		{
			System.out.println(input+" "+" is prime no");
		}
		else
		{
			System.out.println("it is not prime no");
		}
		
		
		
				
	}
	
				
}
