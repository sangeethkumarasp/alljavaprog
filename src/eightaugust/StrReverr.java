package eightaugust;

import java.util.HashSet;
import java.util.Set;

public class StrReverr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"sagty","sagtyy","sagty","agtty"};
		
		Set<String>hs =new HashSet<>();
		for(String gr:s)
		{
			if(hs.add(gr)==false)
			{
				System.out.println("it is duplicate"+gr);
			}
		}
		
		

	}

}
