package Temp;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153;
		int cube=0;
		int r;
		int t;
		t=num;
		
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}

		
		if(t==cube)
		{
			System.out.println("this is armstrong no");
		}else
		{
			System.out.println("it is not armstrong no");
		}
	}

}
