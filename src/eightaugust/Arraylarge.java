package eightaugust;

public class Arraylarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {45,89,96,25};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);

	}

}
