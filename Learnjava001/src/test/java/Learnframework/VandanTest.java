package Learnframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Abstract.Driver;
import Abstract.Loginlocators;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class VandanTest   {
	
	
//	public VandanTest(WebDriver driver) {
//		super(driver);
//	}
	/*
	@Test
	public void validlogin() {
		
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		Loginlocators Login= new Loginlocators(driver) ;
		
		System.out.println("sdsd");
		
		System.out.println(Login.getClass());
		
	}
	*/
	@Test
	public  void  setup() throws IOException
    {
		    Driver driver = new Driver();
		   // WebDriver driver = Driver driver;
		    Loginlocators Login=new Loginlocators(driver.InitateBrowser());
			Login.loginurl();
	       Login.Login("neha.sharma@medikabazaar.com","Nehasharma@1234");
	       System.out.println(driver.getTitle());
		    System.out.println( driver.InitateBrowser());
		    
		
    }
	

	/*public  void test(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sdsd");

	}*/

}
