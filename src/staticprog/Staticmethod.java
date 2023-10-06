package staticprog;

public class Staticmethod {
	int rollno=1;
	String name="dd2";
	static String colleg="ksite";
//	
//	Staticmethod(int r,String n)
//	{
//		rollno=r;
//		name=n;
//		
//	}
	static void chang()
	{
		  colleg="sahhk";
	}
	void display()
	{
		System.out.println(rollno+name+colleg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethod.chang();
		Staticmethod s1=new Staticmethod();
		s1.display();
		Staticmethod s2=new Staticmethod();
		s2.display();
		
		

	}

}
