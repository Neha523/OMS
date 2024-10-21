package Learnjava;

public class Parameterizedmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car();
		speed(1000);
		Parameterizedmethod carcolor=new Parameterizedmethod();
		carcolor.color("red");
		
	}
	

	public static void car()
	{
		System.out.println("Car:BMW");
	}
	public static void speed(int limit)
	{
		System.out.println(limit);
	}
	public void color(String colour)
	{
		System.out.println(colour);
	}
	
}
