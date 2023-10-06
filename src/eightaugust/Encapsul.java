package eightaugust;

public class Encapsul {
	
	
	private int no;
	private String name;
	static String school="ssbm";
	
	public void setno(int newno)
	{
		no=newno;
		
	}
	public int getno()
	{
		return no;
	}
	
	public void setname(String newname)
	{
		name=newname;
	}
	public String getname()
	{
		return name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Encapsul e=new Encapsul();
		e.setname("sangeth");
		e.setno(14);
		System.out.println(e.getname()+" "+e.getno()+school);
				
	}

}
