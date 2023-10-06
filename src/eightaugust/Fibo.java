package eightaugust;

public class Fibo {
	//1123581321

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		c=0;a=1;b=1;
		while(c<50)
		{
			c=a+b;//2//3//5
			if(c>50)
				break;
			
			a=b;//1//2
			b=c;//2//3
			System.out.println(c);
			
			
			
			
		}

	}

}
