package eightaugust;

public class Primbetwtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int low=20;int high=50;
		
		while(low<high)
		{
			boolean s=false;
			
			
			for(int i=2;i<=low/2;i++)
			{
				if(low%i==0)
				{
					s=true;
					break;
				}
			}
			if(!s)
			
				System.out.println(low);
				low++;
			
		}
		
	}

}
