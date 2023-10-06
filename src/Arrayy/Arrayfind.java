package Arrayy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayfind {
	
	
	
	public static String med1(List<Integer>al,int k)
	{
		String s=" ";
		boolean b=false;
		
		for(int i=0;i<al.size();i++)
		{
			if(al.contains(k))
			{
				System.out.println("number found is"+k);
				b=true;
				
			break;
			}
			
			
		}
		
		
		if(b)
		{
			 s="Yes";
			System.out.println(s);
		}else
		{
			s="no";
			System.out.println(s);
			
			System.out.println("value"+k +"is not found"+s);
		
		}
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer arr[]= {1,3,5,2,9,15};
		List<Integer>al1=new ArrayList<Integer>();
		
		al1=Arrays.asList(arr);
		
		Arrayfind.med1(al1,4);

	}

}
