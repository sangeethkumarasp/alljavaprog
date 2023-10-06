package Arrayy;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 0 1 2
		
		
		int a[][]= {{1,4,5,6},{2,3,4,5},{7,8,9,10}};
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		for(int b[]:a)
		{
			for(int c:b)
			{
				System.out.println(c);
			}
		}
}
}