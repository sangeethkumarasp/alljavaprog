package testPrograns;

public class Larges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array declar 1st way
	int []a=new int[5];
	
	
	//array declare 2nd way
	int[]b= {4,8,6,9,1,5,45,25,36};
	
	
	int largest=b[0];
	int second=b[0];
	for(int i=0;i<b.length;i++)
	{
		if(largest<b[i])
		{
			second=largest;
			
			largest=b[i];
		}else if(second<b[i])
		{
			
			second=b[i];
			//System.out.println(second);
		}
	}
	
		
		System.out.println(second);
	}

}
