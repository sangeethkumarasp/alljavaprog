package Stringv2;

import java.util.Scanner;

public class Oddreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//program to find entered number is odd r even
		
		
		Scanner buk=new Scanner(System.in);
		
		
		
		
	System.out.println("Please enter the no of values");
	
	int noofvalues=buk.nextInt();
	int al[]=new int[noofvalues];
	
	for(int i=0;i<=al.length-1;i++)
	{
		System.out.println("enter the value");
		 al[i]=buk.nextInt();
		
	}
	
	System.out.println("total input array size is"+al.length);
	
	
	for(int i=0;i<al.length;i++)
	{
		if(al[i]%2==0)
		{
			System.out.println("even no");
		}else
		{
			System.out.println("it is odd no");
		}
			
	}
	
	
	
	
	}

}
