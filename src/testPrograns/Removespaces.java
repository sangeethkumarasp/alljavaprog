package testPrograns;

import java.util.Scanner;

public class Removespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter the string");
String hy=input.nextLine();
String a=hy.replaceAll("\\s+", " ");
System.out.println(a);


	}

}
