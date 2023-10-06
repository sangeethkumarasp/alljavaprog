package Arrayy;

public class Duplicatvalu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] st= {"san","ban","san","van"};
		for(int i=0;i<st.length-1;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if((st[i].equals(st[j])))
				{
					System.out.println(st[j]);
				}
				
			}
			
		}
		

	}

}
