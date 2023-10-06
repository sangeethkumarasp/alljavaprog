package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al =new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		
		ListIterator l =al.listIterator();
		while(l.hasNext())
		{
			l.add(67);
			l.add(68);
			int a=(Integer)l.next();
			
			
			System.out.println(a);
		}
		
		System.out.println(al);
		
		

	}

}
