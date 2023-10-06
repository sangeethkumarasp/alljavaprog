package Temp;

import java.util.Scanner;

public class Strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter input");
String n=input.nextLine();
System.out.println("im printing string  "+n);
String rev="";
System.out.println(n.length());
for(int i=n.length()-1;i>=0;i--)
{
	rev=rev+n.charAt(i);
}

System.out.println(rev);
	}

}
