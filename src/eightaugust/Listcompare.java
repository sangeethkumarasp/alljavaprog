package eightaugust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>ls =new ArrayList<>();
		ls.add("saf");
		ls.add("dff");
		ls.add("frt");
		
		List<String>ls2 =new ArrayList<>();
		ls2.add("saf");
		ls2.add("dff");
		ls2.add("frt");
		
		List<String>ls3=new ArrayList<>();
		boolean flag=ls.equals(ls2);
		System.out.println(flag);
		
		String[]s=new String[ls.size()];
		s=ls.toArray(s);
		
		List l4=Arrays.asList(s);
		
		System.out.println(l4);
		
		}
		
		
	}


