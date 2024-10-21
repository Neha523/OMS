package Programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignmentwait {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		/*driver.findElement(By.xpath("//label/span[normalize-space()='User']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("div[class='modal-body'] p")));
		driver.switchTo().alert().accept();*/
		Select list=new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
	    list.selectByValue("consult");
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.name("signin")).click();
	    WebDriverWait screen=new WebDriverWait(driver,Duration.ofMinutes(1));
	    screen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='ProtoCommerce Home']")));
	    Add(driver);
	    }
	    
public static void Add(WebDriver driver)
	    {
	    List<WebElement> products= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
	    System.out.println(products.size());
	    for (int i=0;i<products.size();i++)
	    {   
	    	 String productname1=products.get(i).getText();
	    	 products.get(i).click();
	    	System.out.println(productname1);
	    	
	    	 }
	   
	    
}
}
