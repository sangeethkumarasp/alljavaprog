package Arrayy;

public class Highestvalueinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {21,12,32,22};
		
		int a=0;
		int b=3;
		
		String d=null;
		
		System.out.println(d.length());
		
		if("ght".equals(d))
		{
			
			System.out.println("nullpointer");
			
		}
		
//int c=b/a;
		
		System.out.println(d);
		
		
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]>arr[j])
				{
					max=arr[i];
				}
				
			}
		}
		
		System.out.println(max);
	}

}
