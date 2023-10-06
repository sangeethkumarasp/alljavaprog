package Arrayy;

public class Comparrable implements Comparable<Comparrable>{

int age;
String name;
int amount;

public Comparrable(int age,String name,int amount)
{
	this.age=age;
	this.name=name;
	this.amount=amount;
}

	@Override
	public int compareTo(Comparrable o) {
		// TODO Auto-generated method stub
		
		
		if(age==o.age)
		return 0;
		
		else if(age>o.age)
		return 1;
		
		else
			
			return -1;
	}

}
