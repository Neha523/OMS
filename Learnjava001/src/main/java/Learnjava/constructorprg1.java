package Learnjava;

public class constructorprg1 {
	
	int Modelyear;
	String Modelname;
	
	public constructorprg1(int year,String name )
	{
		Modelyear=year;
		Modelname=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorprg1 obj=new constructorprg1(1960,"Mustang");
		System.out.println(obj.Modelyear +" "+obj.Modelname);

	}
	

}
