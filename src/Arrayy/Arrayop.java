package Arrayy;

public class Arrayop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] s= {1,2,3,5,8,9,};
		//adding value
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]+"name");
		}
		//sum up all array values
		int temp=0;
		for(int i=0;i<s.length;i++)
		{
			temp+=s[i];
		}
		System.out.println(temp);
		
		//finding greater value
		
		int max=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i]>max)max=s[i];
			
		}
		System.out.println(max);

	}

}
