package Stringv2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Substr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="dangete";
		String k="k%um#$ar";
String io=(s+k);

io.replaceAll("[^a-zA-Z0-9]", " hhhh");


List<Character>ls =new ArrayList<>();


System.out.println(io.replaceAll("[^a-zA-Z0-9]", " "));


for(int i=io.length()-1;i>=0;i--)
{


	
	ls.add(io.charAt(i));
}

Iterator<Character>cl=ls.iterator();

while(cl.hasNext())
{
	System.out.print(cl.next());
}




		
		
		
System.out.println(s.substring(2, 4));
	}

}
