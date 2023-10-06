package stringprograms;

import java.util.Scanner;

public class Stringpalindrome {
	static String rev="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("enter the value");
		String s=in.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}

	}

}
