package practise;

import java.util.Scanner;

public class Revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter input string");
	String input=s.nextLine();
	int a=input.length();
	String rev="";
	for(int i=input.length()-1;i>=0;i--)
	{
		rev=rev+input.charAt(i);
	}
	System.out.println(rev);
	
	if(input.equals(rev))
	{
		System.out.println("it is palindrome");
	}else
	{
		System.out.println("it is not palindrome");
	}
			

}
}

