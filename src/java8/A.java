package java8;


@FunctionalInterface
public interface A {
	
	void med1();
	
	
	default void med2()
	{
		System.out.println("this is from parent class");
	}
	
	static void med3()
	{
		System.out.println("static method from parent class");
	}
	
	

}
