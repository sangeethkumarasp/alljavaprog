package Arrayy;

public class Search {
int arr[]= {1,5,4,7,9};


public  void ser(int b)
{
	int a=arr.length;
	
	int count=0;
	for(int i=0;i<a;i++)
	{
		if(arr[i]==b)
		{
			count=i;
		}
		
	}
	System.out.println(count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s =new Search();
		s.ser(4);
		
		

	}

}
