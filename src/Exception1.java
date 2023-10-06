
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try
		{
			
			int a=10;
			int b=0;
			int c=a/b;
			
			throw new ArithmeticException();
			
		}catch(NullPointerException es)
			{
				System.out.println(es.getMessage());
			}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
