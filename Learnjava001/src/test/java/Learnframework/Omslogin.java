package Learnframework;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import org.testng.annotations.Test;
import Abstract.Loginlocators;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Omslogin {
        
	
     

	@Test
		public void validlogin() throws IOException
		{ 
			
			WebDriverManager.chromedriver().avoidBrowserDetection().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);	
		Loginlocators Login=new Loginlocators(driver);	
		Login.loginurl();
       Login.Login("neha.sharma@medikabazaar.com","Nehasharma@1234");
       System.out.println(driver.getTitle());
       String Expectedresult="PROTA | Getting Started!";
       Assert.assertEquals( driver.getTitle(), Expectedresult);
       driver.quit();
	}
	
		 @Test
		 public void invalidlogin() throws IOException 
		 {
			 
			   WebDriverManager.chromedriver().avoidBrowserDetection().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
			    Loginlocators Login=new Loginlocators(driver);
				Login.loginurl();
	            Login.Login("neha1.sharma@medikabazaar.com","Nehasharma@1234");
	            System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	            driver.quit();
	       
		}
   
}
