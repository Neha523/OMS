package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);*/
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://protauat.medikabazaar.com/");
		driver.findElement(By.xpath("//button[@class='btn login']")).click();
		driver.findElement(By.id("email")).sendKeys("neha.sharma@medikabazaar.com");
		driver.findElement(By.id("password")).sendKeys("Testme@123");
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
		String s=driver.getTitle();
		System.out.println(s);
		String actual="PROTA | Getting Started!";
		System.out.println(actual);
		System.out.println(s.getClass());
		System.out.println(actual.getClass());
		//Assert.assertEquals(s, actual);
		
		if (s.equals(actual))
		{
			System.out.println("User logged-in successfully");
			
		}
		else
		{System.out.println("User logged not logged ");
		}
		
		driver.findElement(By.linkText("Purchases")).click();
		Thread.sleep(10);
        driver.findElement(By.linkText("Purchase Orders")).click();
        driver.findElement(By.xpath("//a[text()='+ Create Purchase / Consignment Order']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter Supplier Email']")).sendKeys("testsell6@mailinator.com");
        driver.findElement(By.xpath("//button[@id='change_email']")).click();
        Thread.sleep(10);
        driver.findElement(By.xpath("//input[@placeholder='Enter Enter Product SKU']")).sendKeys("KISH00011122");
        driver.findElement(By.xpath("//input[@placeholder='Enter Quantity']")).clear();
         driver.findElement(By.xpath("//input[@placeholder='Enter Quantity']")).sendKeys("2");
         Thread.sleep(5000);
         //WebDriverWait wait =new WebDriverWait(driver,);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='+ Add product']"))).click();
       
         //driver.findElement(By.xpath("//button[text()='+ Add product']")).click();
         JavascriptExecutor  js=(JavascriptExecutor)driver;
         WebElement element=driver.findElement(By.xpath("//button[text()='+ Add product']"));
         js.executeScript("arguments[0].scrollIntoView;", element);
         try 
         {
        	 element.click(); 
        	 
         }
         catch(Exception e)
         { 
        	 System.out.println("e="+e);
        	 element.click(); 

         }
        driver.findElement(By.xpath("//input[@id='price1']")).clear();
         driver.findElement(By.xpath("//input[@id='price1']")).sendKeys("10");
         Thread.sleep(5000);
         WebElement Taxselection=driver.findElement(By.xpath("//select[@id='tax_percent'])"));
         Select tax=new Select(Taxselection);
         
         JavascriptExecutor  jss=(JavascriptExecutor)driver;
         jss.executeScript("arguments[0].scrollIntoView;", tax);
        
         
         
		
		
	}

}
