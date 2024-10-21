package Learnjava;

public class Methodoverloadingargument {
	 
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println(Methodoverloadingargument.add(15,15));
		System.out.println(Methodoverloadingargument.add(15,15,15));

	}

}
