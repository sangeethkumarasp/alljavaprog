package eightaugust;

public class Encap {
	
	private int a;
	private int b;
	private int c;
	
public int geta()
{
	return a;
}

public void seta(int no)
{
	a=no;
}
public int getb()
{
	return b;
}
public void setb(int no2)
{
	b=no2;
}
public int getc()
{
	return c;
}
public void setc(int no3)
{
	c=no3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap e =new Encap();
		e.seta(15);
		e.setb(20);
		e.setc(55);
		
		System.out.println(e.geta()+""+e.getb()+""+e.getc());
		
	}}
	