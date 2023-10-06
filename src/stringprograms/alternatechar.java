package stringprograms;

public class alternatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sangeth kumar";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2==0)
			{
				System.out.println("the values are"+i+s.charAt(i));
			}
		}
		System.out.println();

	}

}
