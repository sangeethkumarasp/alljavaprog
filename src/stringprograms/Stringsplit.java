package stringprograms;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="san-ge-th";
		String[] s2=s1.split("-");
		int e=s2.length;
		
		String s3="   sangeth   i  ";
		
		String s4 =s3.trim();
		for(int i=0;i<e;i++)
		{
			System.out.println(s2[i]);
			
		}
		
		
	   

	}

}
