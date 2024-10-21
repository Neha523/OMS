package Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;


public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		List<WebElement> s=driver.findElements(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr"));
		int count =s.size();
		System.out.println("No Of rows"+count);
	    List<WebElement> column=driver.findElements(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr/th"));
        int col=column.size();
        System.out.println("No Of columns"+col);
        
        for (int i=0;i<s.size();i++)
        {
        	 
               if(i==3 )
            	   
        	    {
        		String data=driver.findElement(By.xpath("(//tr)[3]")).getText();
        		System.out.println(data);
        	    }  
        	   else
        	   {
        		continue;
        	   }
        	 
        }
	}

}
