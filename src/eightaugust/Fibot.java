package eightaugust;

public class Fibot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int temp=0;int a=0;int b=1;
		for(int i=0;i<25;i++)
		{
			System.out.println(temp);
			
			 temp=a+b;
			a=b;
			b=temp;
			
		}
	}

}
