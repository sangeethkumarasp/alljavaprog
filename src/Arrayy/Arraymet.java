package Arrayy;

public class Arraymet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,5,6};
		Arraymet a=new Arraymet();
		a.sum(arr);
		
		
		

	}
	
	public  void sum(int arr[])
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=arr[i];
		}
			
		
		System.out.println(sum);
	}

}
