package eightaugust;

public class Stringdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"sange","rajes","sange"};
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("it is duplicate"+names[j]);
				}
				
			}
		}

	}

}
