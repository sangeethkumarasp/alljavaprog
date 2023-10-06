package Arrayy;
//array of objects
public class arrobj {
	
	int id;
	String name;
	
	public arrobj(int k,String s)
	{
		id=k;
		name=s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrobj[] se=new arrobj[5];
		se[0]=new arrobj(1,"sangeeth");
		se[1]=new arrobj(2,"sangfrth");
		se[2]=new arrobj(2,"sangffrth");
		se[3]=new arrobj(2,"sangffrtdgdh");
		
		for (int i=0;i<se.length;i++)
		{
			System.out.println(se[i].id+se[i].name);
		}
		
		
		

	}

}
