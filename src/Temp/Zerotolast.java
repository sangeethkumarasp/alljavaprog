package Temp;

import java.util.Arrays;

public class Zerotolast {
	
	public static void arra(int n[],int a)
	{
		int count=0;
		
		for(int i=0;i<a;i++)
		{
			if(n[i]!=0)
			{
				n[count++]=n[i];
			}
		}
		while(count<a)
		{
			n[count++]=0;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {1,2,0,4,0,5};
		int a=n.length;
		Zerotolast.arra(n,a);
		for(int i=0;i<a;i++)
		{
			System.out.println(n[i]);
		}
		
		
	}

}
