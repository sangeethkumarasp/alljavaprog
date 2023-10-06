package testPrograns;

public class arrayzerotoend {
	
	public static void pust(int arr[],int n)
	{
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		
		while(count<n)
		{
			arr[count++]=0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {'4','8','0','5','0','1'};
int n=arr.length;
pust(arr,n);

for(int i=0;i<n;i++)
{
	System.out.println(i);
}

	}

}
