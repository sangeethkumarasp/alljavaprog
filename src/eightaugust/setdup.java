package eightaugust;

import java.util.HashSet;
import java.util.Set;

public class setdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]s= {"sd","fr","sd"};
		
		Set<String>o=new HashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
				if(o.add(s[i])==false)
				{
					System.out.println("im duplicate"+s[i]);
				}



}
	}
}
	
