package Abstract;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Driver {
	
	//public WebDriver driver;
	
	public 	WebDriver InitateBrowser() throws IOException {
		 WebDriver driver;
			Properties prop= new Properties();
	        FileInputStream fis=new FileInputStream("C:\\Users\\neha.sharma\\eclipse-workspace\\Learnjava001\\src\\main\\java\\Abstract\\Globaldata.properties");
	        prop.load(fis);
//	        if(prop.getProperty("browser").equals("chrome"))
//	        {
	        	WebDriverManager.chromedriver().avoidBrowserDetection().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				 driver = new ChromeDriver(options);	

			    return  driver;
//	        }
//	        else if (prop.getProperty("browser").equals("firefox"))
//	        {
//	        	//driver=new FirefoxDriver();
//	        }
//	        else
//	        {
//	        	//driver=new EdgeDriver();
//	        }
	        
	       // driver.get(prop.getProperty("url"));
			
		}

	
}
