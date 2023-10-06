package Stringv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Strrever {
	
	//For char reverse
	
	public static void med1(String s)
	{
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
	
	//using collection
	
	public static void med2(String s)
	{
		
		char[]c=s.toCharArray();
		
		List<Character>ts =new ArrayList<Character>();
		for(char cd:c)
		{
			ts.add(cd);
		}
		
		

		
		Collections.reverse(ts);
		
Iterator<Character>ti=	ts.iterator();

while(ti.hasNext())
{
	System.out.println(ti.next());
}
		
		
	}
	
	
	public static void med3(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="robionson";

//med1(s);
//med2(s);

med3(s);
	}

}
