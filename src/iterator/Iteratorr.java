package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList al =new ArrayList();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator i =al.iterator();
		while(i.hasNext())
		{
			 int a =(Integer)i.next();
			 
			if(a%2!=0)
			 
				 i.remove();
				 
			
			
		}
		System.out.println(al);
		
		
		
		
		
		
		

	}

}
