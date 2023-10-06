package Arrayy;

public class Arrayme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,5,6,7};
		arraymed(reverse(arr));
		//reverse(arr);
		
		

	}
	
	public static void arraymed(int[]ae)
	{
		for(int i=0;i<ae.length;i++)
		{
			System.out.println(ae[i]);
		}
	}
	
	/*public static void reversearr(int[]user)
	{
		
		int rev[]=new int[user.length];
		
		for(int j=user.length-1;j>=0;j--)
		{
			System.out.println(user[j]);
		}
		
	}
*/
	
	
	public static int[] reverse(int[]ele)
	{
		int rev[]=new int[ele.length];
		
		for(int i=0,j=rev.length-1;i<ele.length;i++,j--)
		{
			
			rev[j]=ele[i];
			
			
			
			
		}
		
		
		
		
		return rev;
		
	}
}
