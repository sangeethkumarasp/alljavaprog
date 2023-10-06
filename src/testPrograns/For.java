package testPrograns;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for print numbers ten to one
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
		//to print numbers one to ten
		for (int i=1;i<10;i++)
		{
			System.out.println(i);
		}
//to print multiples of 5
		for (int i=0;i<100;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}

}
