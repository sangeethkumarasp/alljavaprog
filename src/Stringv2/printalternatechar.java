package Stringv2;

public class printalternatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="sangeeth";
		
		
		for(int i=0;i<s.length()-1;i++){
			
			if(i%2==0)
			{
				System.out.println(s.charAt(i));
			}
			
		}
	}

}
