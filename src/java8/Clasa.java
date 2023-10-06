package java8;

public class Clasa implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A.med3();
		Clasa ad=new Clasa();
		ad.med2();
		ad.med1();

	}

	@Override
	public void med1() {
		// TODO Auto-generated method stub
		
		System.out.println("overriding the abstract methid");
		
	}

}
