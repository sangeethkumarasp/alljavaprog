package Stringv2;

public class Stringsplitandcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="sangeeth.automation#selenium";
		String[]s1=s.split("\\.");
		String[]s2=s1[1].split("#");
		
		System.out.println(s2[0]);
		
		
		String s5=s.substring(9,19);
		System.out.println(s5);
	}

}
