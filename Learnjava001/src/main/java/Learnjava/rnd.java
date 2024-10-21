package Learnjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class rnd {public static void main(String[] args)
	
	 throws InterruptedException 
	{
	WebDriverManager.chromedriver().avoidBrowserDetection().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://prota.medikacloud.com/login");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("prota@medikacloud.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("medika@1234");
	driver.findElement(By.xpath("//button[@class='button-brandisBlue button-properties ']")).click();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	/*driver.findElement(By.xpath("//span[@class='center']//*[name()='svg']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Current Inventory']")).click();
	//t-multi-carousel-item react-multi-carousel-item--active ']//button[@class='next-button']//*[name()='svg']")).click();*/
	driver.findElement(By.xpath("//p[normalize-space()='Create PO']")).click();
	driver.findElement(By.xpath("//p[normalize-space()='Select Supplier']")).click();
	Actions action=new Actions(driver);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='sc-jUElsq dBRjMx search-input'])[1]")).sendKeys("35873");
	driver.findElement(By.xpath("(//input[@class='sc-jUElsq dBRjMx search-input'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='sc-GTUqm fSJqtZ'])[1]")).click();
	Thread.sleep(1000);
	WebElement button=driver.findElement(By.xpath("//button[contains(@class,'button-brandisBlue button-properties')]//p[@class='button-text'][normalize-space()='Select Supplier']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	wait.until(ExpectedConditions.visibilityOf(button)).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[normalize-space()='Add SKU']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
	driver.findElement(By.xpath("//div[@class='sc-ctaXUJ dOXNZY spread']//button[contains(@class,'button-brandisBlue button-properties')]")).click();
	driver.findElement(By.xpath("(//input[@value='0'])[1]")).clear();
	driver.findElement(By.xpath("(//input[@value='0'])[1]")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody/tr/td[6]/div[1]/input[1]")).clear();
	WebElement gst=driver.findElement(By.xpath("//tbody/tr/td[6]/div[1]/input[1]"));
	wait.until(ExpectedConditions.visibilityOf(gst)).sendKeys("5");
	driver.findElement(By.xpath("(//input[@value='0'])[2]")).sendKeys("5");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/*[name()='svg'][1]")).click();
	driver.findElement(By.cssSelector(".rdrDay.rdrDayToday")).click();
	System.out.println(driver.findElement(By.cssSelector(".rdrDay.rdrDayToday")).getText());
	driver.findElement(By.cssSelector(".product-order-table-wrapper")).click();
	driver.findElement(By.xpath("//div[@class='dates-container']//div[2]//div[1]//*[name()='svg']")).click();
	System.out.println(driver.findElement(By.xpath("//button[@class='rdrDay rdrDayToday']")).getText());
	driver.findElement(By.cssSelector(".product-order-table-wrapper")).click();
	driver.findElement(By.xpath("//div[@class='checkbox false']")).click();
	driver.findElement(By.xpath("//p[normalize-space()='Save']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[2]/div[1]/div[1]/p[1]")).click();
	WebElement sku=driver.findElement(By.xpath("//input[@placeholder='Search for SKU’s']"));
	/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	wait.until(ExpectedConditions.visibilityOf(sku)).sendKeys("MBLDI160219000000730");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='checkbox false']")).click();
	driver.findElement(By.xpath("//img[@alt='logo']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[@class='sc-gyUexO bnDvFk'][normalize-space()='Forecast']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search for SKU’s']")).sendKeys("MBLDI160219000000730");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='checkbox false']")).click();
	Thread.sleep(2000);
   	check3.click();
	
	/*driver.findElement(By.xpath("//span[@class='center']//*[name()='svg']")).click();
	driver.findElement(By.xpath("(//a[normalize-space()='Expired'])[1]")).click();*/
	
	
	
	}

	
}
