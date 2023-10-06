package Arrayy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Comparrable>al=new ArrayList<Comparrable>();
		al.add(new Comparrable(90,"sanh",45));
		al.add(new Comparrable(10,"sanhjj",25));
		al.add(new Comparrable(30,"sanhhh",75));
		al.add(new Comparrable(70,"sanhuii",35));
		
		
		Collections.sort(al);
		
		
		for(Comparrable e:al)
		{
			System.out.println(e.age+" "+e.amount+" "+e.name);
		}
		

	}

}
