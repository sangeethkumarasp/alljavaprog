package Arrayy;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {8,3,4,7,9};
		
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
		
		}
		
		
		
for(int a:arr)
{
	System.out.println(a);
}

	}

}
