package eightaugust;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ssngeeettth";
		char []c=name.toCharArray();
		int cnt=0;
		
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(c[i]== c[j])
				{
					System.out.println(c[j]);
					cnt++;
					break;
					
				}
			}
		}
		System.out.println(cnt);
		

	}

}
