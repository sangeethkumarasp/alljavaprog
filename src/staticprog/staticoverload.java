package staticprog;

public class staticoverload {
	static int a=10;
	
	public static int main()
	{
		return a=20;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAIN METHOD");
		System.out.println(staticoverload.main());

	}

}
