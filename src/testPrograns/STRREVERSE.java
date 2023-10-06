package testPrograns;

public class STRREVERSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="sangeeth";
		int length=a.length();
		System.out.println(length);
		
		String rev="";
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
	System.out.println(rev);
		
		
	}

}
