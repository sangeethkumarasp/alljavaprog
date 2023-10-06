package testPrograns;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("enter value");
		int inn=input.nextInt();
		
		boolean flag=true;
		
		
		for(int i=2;i<inn;i++)
		{
			if(inn%i==0)
			{
				flag=false;
				break;
				
			}
		}
		
if(flag)
{
	System.out.println(inn+"  it is prime number");
}else
{
	System.out.println(inn+"   it is not prime no");
}
	}

}
