package Temp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hshstringdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
System.out.println("enter no of string array yow want");
int a=Integer.parseInt(in.nextLine());

String[] ar=new String[a];

for(int i=0;i<a;i++)
{
	System.out.println("enter your input");
	ar[i]=in.nextLine();
	
}
System.out.println(Arrays.toString(ar));


HashMap<String,Integer> hm=new HashMap<String,Integer>();
for(String ae:ar)
{
	if(hm.containsKey(ae))
	{
		hm.put(ae,hm.get(ae)+1);
	}else
	{
		hm.put(ae, 1);
	}
}


for(Map.Entry<String, Integer>mo:hm.entrySet())
{
	if(mo.getValue()>1)
	{
	System.out.println("key values"+mo.getKey()+"  value is"+mo.getValue());
	}
}


	}

}
