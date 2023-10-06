package eightaugust;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
					
				}
			}
		}

	}

}
