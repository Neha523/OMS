package Learnjava;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class prjt1 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/client/");
		
        driver.findElement(By.id("userEmail")).sendKeys("nehatest1689@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Testme@123");
        driver.findElement(By.id("login")).click();
        driver.manage().window().maximize();
       Thread.sleep(1000);
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card")));
        List<WebElement> a=driver.findElements(By.className("card"));
        System.out.println(a.size());
        for (int i=0;i<a.size();i++)
        {
        	Thread.sleep(1000);
            List<WebElement> b=driver.findElements(By.xpath("(//button[@class='btn w-10 rounded'][normalize-space()='Add To Cart'])"));
            System.out.println(b.get(i).getText());
            Thread.sleep(1000);
            b.get(i).click();
           // b.get(i).click();
        //System.out.println(b.gettext(i));
	}
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@routerlink='/dashboard/cart'])[1]")).click();
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		  Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Checkout'])[1]")).click();
        Select aa= new Select(driver.findElement(By.xpath("(//select[@class='input ddl'])[2]")));
        aa.selectByVisibleText("26");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Test");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("123");
        WebElement test=driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
        test.sendKeys("IND");
        Thread.sleep(1000);
        test.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER));
        driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
        Thread.sleep(1000);
        List<WebElement> b=driver.findElements(By.cssSelector(".ng-star-inserted"));
        System.out.println(b.size());
        for (int i=0;i<b.size();i++)
        {  
        	//List<WebElement> c=driver.findElements(By.cssSelector(".ng-star-inserted"));
        	if (b.get(i).getText()==" 65ae2880a86f8f74dc5d06ab "||b.get(i).getText()== " 65ae2880a86f8f74dc5d06ae "||b.get(i).getText()==" 65ae2880a86f8f74dc5d06b1  ")
        	{
        			System.out.println(b.get(i).getText());
        	}
        }
       
        
        
      
        
        
        		}}
