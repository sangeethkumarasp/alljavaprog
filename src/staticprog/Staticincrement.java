package staticprog;



public class Staticincrement {
	//int count=0;//program for non static variable
	static int count=0;//program for static variable
	Staticincrement()
	{
		count++;
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticincrement s1= new Staticincrement();
		Staticincrement s2=new Staticincrement();
		Staticincrement s3=new Staticincrement();
		

	}

}
