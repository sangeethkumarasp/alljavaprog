package Temp;

public class Spacerevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sadf gty hyu";
		char[]c=s.toCharArray();
		
		char[]cg=new char[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				cg[i]=' ';
			}
			
		}
		
		int j=cg.length;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				if(c[j]==' ')
				{
					j--;
				}
				c[j]=c[i];
				j--;
			}
		}
	}
	

}
