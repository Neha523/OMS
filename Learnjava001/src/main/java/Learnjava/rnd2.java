package Learnjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rnd2 {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().avoidBrowserDetection().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://test.vizi.in/");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("nipun.gupta@medikabazaar.com");
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Medika@123");
	driver.findElement(By.xpath("//button[@class='button-brandisBlue button-properties ']")).click();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//p[@class='sc-gyUexO bnDvFk'][normalize-space()='Forecast'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='checkbox false'])[1]")).click();
	driver.findElement(By.xpath("(//p[normalize-space()='Add To Purchase Order'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//p[normalize-space()='Select Supplier'])[1]")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@class='sc-jUElsq dBRjMx search-input'])[1]")).click();
	driver.findElement(By.xpath("(//div[normalize-space()='Medikabazaar'])[1]")).click();
	driver.findElement(By.xpath("(//p[@class='button-text'][normalize-space()='Select Supplier'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/input[1]")).clear();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/input[1]")).sendKeys("5");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 driver.findElement(By.xpath("//div[@class='dates-container']//div[1]//div[1]//p[1]")).click();
	driver.findElement(By.xpath("//button[@class='rdrDay rdrDayToday']//span[@class='rdrDayNumber']")).click();
	driver.findElement(By.xpath("(//div[@class='product-order-table-wrapper'])[1]")).click();
	driver.findElement(By.xpath("//div[@class='dates-container']//div[2]//div[1]//*[name()='svg']")).click();
	driver.findElement(By.xpath("//button[@class='rdrDay rdrDayToday']//span[@class='rdrDayNumber']")).click();
	//driver.findElement(By.xpath("//div[@class='product-order-table-wrapper']")).click();
	driver.findElement(By.xpath("(//div[@class='checkbox false'])[1]")).click();
	driver.findElement(By.xpath("(//p[normalize-space()='Save'])[1]")).click();
	}
}
