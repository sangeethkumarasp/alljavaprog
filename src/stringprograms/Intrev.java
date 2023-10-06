package stringprograms;

public class Intrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1458;
		int rev =0;
		while(a!=0)
		{
			rev=rev*10+a%10;//8
			a=a/10;//145
			
		}
		System.out.println(rev);

	}

}
