package testPrograns;

import java.util.HashMap;
import java.util.Map;

public class Duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"san","san","ran"};
		
		HashMap<String,Integer>hm =new HashMap<String,Integer>();
		
		for(String d:s)
		{
			if(hm.containsKey(d))
			{
				hm.put(d,hm.get(d)+1);
			}
			else
			{
				hm.put(d,1);
			}
		}
		
		
		for(Map.Entry<String, Integer>mo:hm.entrySet())
		{
			if(mo.getValue()>1)
			{
				System.out.println(mo.getKey()+mo.getValue());
			}
			
		}
		

	}

}
