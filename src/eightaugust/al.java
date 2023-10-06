package eightaugust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class al {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer>ah=new ArrayList<Integer>();
		ah.add(1);
		ah.add(7);
		ah.add(11);
		ah.add(3);
		ah.add(5);
		ah.add(2);
		
		Collections.sort(ah);
		Collections.reverse(ah);
		/*Iterator it=ah.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		Integer[] i=ah.toArray(new Integer[ah.size()]);
				
				for(Integer f:i)
				{
					System.out.println(i[f]);
				}
		
		
	}

}
