package practise;

import java.util.Scanner;

public class Extractnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the alphanumeric string:");
		String inputByUser= sc.nextLine();

		System.out.println("String entered by user:+inputByUser");

		for(int i=0;i<inputByUser.length();i++)
		{
		char c= inputByUser.charAt(i);
		if(Character.isDigit(c))
		sum=sum+ Character.getNumericValue(c);
		

		if(sum!=0){
		System.out.println("Sum of numbers found in "+inputByUser +" :"+sum);
		}
		else
		{
		System.out.println(inputByUser+" is not an alphanumeric.");
		}
		

	}

}
}
