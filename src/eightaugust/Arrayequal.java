package eightaugust;

public class Arrayequal {
	
	
	public void ArrayCheck(int arru[],int searchvalue)
	{
		int fr=0;
		
		for(int i=0;i<arru.length;i++)
		{
			if(searchvalue==arru[i])
			{
				System.out.println("search value is presnt"+arru[i]);
				break;
				
			}
			
			fr++;
			
		}
		
		System.out.println(fr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arru=new int[] {45,25,69,78};
		Arrayequal aq =new Arrayequal();
		aq.ArrayCheck(arru,69);

	}

}
