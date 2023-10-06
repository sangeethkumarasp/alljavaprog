package stringprograms;

import java.util.Arrays;

public class Anagramornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="sasd";
		String str2="assdr";
		
		
		
		if(str1.length()!=str2.length())
		{
			System.out.println("it is not anagram");
		}else
		{
		char[] c1=str1.toCharArray();
		char[]c2=str2.toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("IT is anagram");
		}
		else
		{
			System.out.println("Both strings are not anagram");
		}
		}

	}

}
