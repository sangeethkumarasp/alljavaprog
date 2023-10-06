package Arrayy;

public class ThreeDm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int studentno[][][] = new int[5][5][4];
		studentno[0][0][1]=45;
				studentno[0][1][1]=010;
				studentno[0][1][0]=4;
						studentno[0][1][1]=5;
								
						for(int sno=0;sno<studentno.length;sno++)
						{
							for(int mar=0;mar<studentno[sno].length;mar++)
							{
								for(int ex=0;ex<studentno[sno][mar].length;ex++)
								{
									System.out.print(studentno[sno][mar][ex]);
								}
								
							}
							System.out.println();
						}
						
		
		
		
	}

}
