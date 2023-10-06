package testPrograns;

public class Prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		boolean flag=false;
		
		for(int i=2;i<n/2;i++)
		{
			
			if(n%i==0)
			{
		flag=true;
			}
				
		}
		if(flag)
		{
			System.out.println("it is not prime");
		}else
		{
			System.out.println("it is prime no");
		}
		

	}

}
