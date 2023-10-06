package stringprograms;

public class Zerolast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,4,5,0,5,0,6};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		
		while(count<arr.length)
		{
			arr[count++]=0;
		}
		
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		
	
			
		

	}

}
