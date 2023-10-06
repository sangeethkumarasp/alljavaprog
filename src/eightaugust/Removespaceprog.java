package eightaugust;

public class Removespaceprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="  sangeth   kumar ";
		
		s=s.trim();
	s=s.replaceAll("\\s+", "");
		
		System.out.println(s);
		
	}

}
