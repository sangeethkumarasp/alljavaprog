package star;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=no;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
		no=no+1;
		}
			else
			{
				no=no-1;
			}

	}
	}
	

}
