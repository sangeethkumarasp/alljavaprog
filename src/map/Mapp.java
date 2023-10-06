package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String>mp=new TreeMap<Integer,String>();
		mp.put(1,"sangeth");
		mp.put(2,"jgjg");
		mp.put(3,"jgjgjj");
		
		for(Map.Entry m:mp.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
			
		}
		
		

	}

}
