package Learnjava;

public class Methodoverloadingdatatype {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add (double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Methodoverloadingdatatype.add(10, 15));
		System.out.println(Methodoverloadingdatatype.add(10.01, 15.12));
	}

}
