package Learnjava;

abstract class abstractmotherdata {
	int motherage=30;
	String mothername="Sheela";
	public abstract void babybirth1();
	
}
//Subclass (inherit from Main)
class baby extends abstractmotherdata {
	public int babyweight=3;
	public String babyname="abc";
	public void babybirth1()
	{
		System.out.println("Healthly baby boy born");
	}
}
