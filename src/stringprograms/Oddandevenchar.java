package stringprograms;

public class Oddandevenchar {
	//print odd and even characters

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sangeethkumarisasian";
		
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.println("even char"+s.charAt(i));
			}
			else
			{
				System.out.println("odd char"+s.charAt(i));
			}
		}

	}

}
