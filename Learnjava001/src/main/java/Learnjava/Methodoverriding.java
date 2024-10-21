package Learnjava;

class Bank
{
	int getRateOfInterest()
	{
	return 0;}
}
class ICICI extends Bank
{
	int getRateOfInterest()
   {
     return 5;}
	
 }

class BOB extends Bank
{
	int getRateOfInterest()
   {
     return 8;}
	
 }

public class Methodoverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI obj=new ICICI();
	    System.out.println("icic rate of Interest:"+obj.getRateOfInterest());
	   BOB objj=new BOB();
	    System.out.println("BOB rate of Interest:"+objj.getRateOfInterest());


	}

}
