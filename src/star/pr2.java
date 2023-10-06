package star;

public class pr2 {
	public static void me1(int n,int x)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=x;i++)
		{
			for(int j=x;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x=4;
		me1(n,x);

	}

}
