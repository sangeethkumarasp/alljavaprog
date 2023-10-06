package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//one null key and many null values
	HashMap<String,Integer> ha =new HashMap<String,Integer>();
		ha.put("sangeeth1",12);
		ha.put("sangeetr2",12);
		ha.put("sangeeth3",12);
		ha.put("sangeeth4",12);
		ha.put("sangeeth",12);
		ha.put("null",15);
		ha.put("null",null);
		//System.out.println(ha);
		
		/*Set se =ha.entrySet();
		
		Iterator i =se.iterator();
		
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println("values are"+me.getKey()  +"   "+me.getValue());
			
		}
		*/
		
		for( Map.Entry<String,Integer> a:ha.entrySet())
		{
			System.out.println(a.getKey()+a.getValue());
			
		}

	}

}
