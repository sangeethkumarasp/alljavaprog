package eightaugust;

public class Avgarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {1,1,4};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		double d=sum/arr.length;
		System.out.println(d);
	}

}
