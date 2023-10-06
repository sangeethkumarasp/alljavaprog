package Stringv2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sas";
		String rev="";
		
		
		
		
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
