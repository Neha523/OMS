package Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import Locators.LoginLocator;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginOms {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://protauat.medikabazaar.com/");
		LoginLocator Login=new LoginLocator(driver);
		Login.Loginapp("neha.sharma@medikabazaar.com", "Testme@123");
		String s=driver.getTitle();
		System.out.println(s);
		String actual="PROTA | Getting Started!";
		if (s.equals(actual))
		{
			System.out.println("User logged-in successfully");
			
		}
		else
		{System.out.println("User logged not logged ");
		}
		
       
	}

}
