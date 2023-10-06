package staticprog;

public class STATICVARIABLE {
	
	int empno;
	String Project;
	static String company="capegemini";
	
	 STATICVARIABLE(int e,String p)
	{
		empno=e;
		Project=p;
		
	}
	
	void display()
	{
		System.out.println(empno+""+Project+""+company);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STATICVARIABLE s1=new STATICVARIABLE(1,"sangeeth");
		STATICVARIABLE s2=new STATICVARIABLE(2,"kumar");
		s1.display();
		s2.display();
		
		

	}

}
