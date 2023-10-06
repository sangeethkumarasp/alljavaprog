package eightaugust;

import java.util.Arrays;
import java.util.Scanner;

public class Arysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no of size");
		
		int n=input.nextInt();
		
		Integer[] it=new Integer[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the integer value");
			it[i]=input.nextInt();
		}
		
		System.out.println(Arrays.toString(it));
		
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(it[i]>it[j])
				{
				temp=it[i];
				it[i]=it[j];
				it[j]=temp;
			}
			}
			
			
			
		}
		System.out.println(Arrays.toString(it));
		
		
	}

}
