package eightaugust;

import java.util.Arrays;

public class Insertarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=5;
		int value=4;
		int arr[]= {4,5,8,9,10,1,12,15};
		
		for(int i=arr.length-1;i>index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[5]=4;
		System.out.println(Arrays.toString(arr));
		

	}

}
