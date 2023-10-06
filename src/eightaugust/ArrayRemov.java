package eightaugust;

import java.util.Arrays;

public class ArrayRemov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr=new int[] {45,25,69,78,58};
		
		int removal=2;
		for(int i=removal;i<arr.length-1;i++)
		{
			arr[i]=arr[i]+1;
		}
		System.out.println(Arrays.toString(arr));
		
		}

	}


