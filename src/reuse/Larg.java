package reuse;

public class Larg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[]a= {10,20,40,50};
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==smallest)
			{
				smallest=largest;
			}
			
			
			else if(a[i]<largest)
			{
				smallest=largest;
				largest=a[i];
			}else if(a[i]<smallest)
			{
			smallest=a[i];
					
			}
		}
		System.out.println(largest);
	}

}
