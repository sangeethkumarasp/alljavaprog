package eightaugust;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hshmap {

	public static void main(String[] args) {
		
		String s= "sangeeth";
		char[] c=s.toCharArray();
		
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(char df:c)
		{
			if(hm.containsKey(df))
			{
				hm.put(df,hm.get(df)+1);
			}
			else
			{
				hm.put(df,1);
			}
		}
		
		
		
		for(Map.Entry<Character, Integer>mk:hm.entrySet())
		{
			System.out.println(mk.getKey()+"   "+mk.getValue());
			
		}
		
	}
}
