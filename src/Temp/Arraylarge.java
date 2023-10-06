package Temp;

public class Arraylarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n[]= {14,25,19,45,69,45};
		int largest=n[0];
		int smallest=n[0];
		
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>largest)
			{
				smallest=largest;
				largest=n[i];
				
			}else if(n[i]>smallest)
				{
					smallest=n[i];
				}
			}
		
		System.out.println(smallest);
		}
		

		
	
}

