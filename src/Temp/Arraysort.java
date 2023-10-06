package Temp;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the input string numbers");
		
		int n=Integer.parseInt(input.nextLine());
		String[]ar=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter input value");
			ar[i]=input.nextLine();
			
		}
		System.out.println(Arrays.toString(ar));
		String temp;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(ar[i].compareTo(ar[j])>0)
			{
				
			
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			}
		}
	}
				System.out.println(Arrays.toString(ar));

	}

}
