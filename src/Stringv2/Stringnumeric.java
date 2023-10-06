package Stringv2;

public class Stringnumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="sange233";
		int sum=0;
		
		
	boolean flag=	s.matches("[A-Za-z0-9]+");
	
	
	if(flag=true)
	{
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			
			if(Character.isDigit(c)) {
				//sum=sum+Character.getNumericValue(c);
				System.out.println(c);
			}
		}
	}
System.out.println(sum);
	}

}
