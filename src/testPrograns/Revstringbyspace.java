package testPrograns;

import java.util.Scanner;

public class Revstringbyspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter the string");
String hy=input.nextLine();
char[] cf=hy.toCharArray();
char[]ner=new char[hy.length()];
for(int i=0;i<hy.length();i++)
{
	if(cf[i] ==' ')
	{
		ner[i]=' ';
	}
}

int j=ner.length-1;
for(int i=0;i<hy.length();i++)
{
	if(cf[i]!=' ')
	{
		if(ner[j]==' ')
		{
			j--;
			
		}
		
		ner[j]=cf[i];
		j--;
		
	}
}

System.out.println(String.valueOf(ner));
	}

}
