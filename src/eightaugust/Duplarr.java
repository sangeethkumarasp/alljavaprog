package eightaugust;

public class Duplarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {45,25,45,69,85};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
			
		}

	}

}
