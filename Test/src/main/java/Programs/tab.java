package Programs;

import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set <String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String s=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(s);
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(s);
        
	    
	    
       
	
	}

}