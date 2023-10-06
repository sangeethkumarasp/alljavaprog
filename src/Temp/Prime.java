package Temp;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		boolean b=false;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				b=true;
			}
		}
		if(b)
		{
			System.out.println("it is not prime");
		}else
		{
			System.out.println("it is prime");
		}

	}

}
