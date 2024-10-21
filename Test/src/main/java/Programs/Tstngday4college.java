package Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tstngday4college {
	@Test(dataProvider="studentdata")
	public void branch(String Firstname,String lastname)
	{
		System.out.println("Studying in computer sciencebranch");
		System.out.println(Firstname);
		System.out.println(lastname);
	}
	@Test(groups= {"SMOKE"})
	public void lab()
	{
		System.out.println("studing in cs lab");
	}
	
   @DataProvider
	public Object[][] studentdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="Neha";
		data[0][1]="Sharma";
		data[1][0]="vicky";
		data[1][1]="sharma";
		data[2][0]="xyz";
		data[2][1]="jain";
		return data;
				}
	}
	
	
