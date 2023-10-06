package staticprog;

public class Staticv2 {
	
	int rollno;
	String name;
	static String school;
	
	
	Staticv2(int r,String n)
	{
		
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+name+school);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticv2 s1=new Staticv2(10,"sangeeth");
		Staticv2 s2=new Staticv2(1,"kumar");
		s1.display();
		s2.display();
		
		

	}

}
