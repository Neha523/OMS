package Programs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tstngday3school {
	
	@Test(groups= {"SMOKE"})

	public void standard()
	{
		System.out.println("Studing in 12 class");
	}
	@AfterTest
	public void sports()
	{
		System.out.println("Playing badminton");
	}
	@BeforeTest
    public void stream()
	{
		System.out.println("studying in sciencemaths stream");
	}

}
