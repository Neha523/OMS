package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://protadev.medikabazaar.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("neha.sharma@medikabazaar.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Medika@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Orders']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Sales Orders']"))).doubleClick().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		a.moveToElement(driver.findElement(By.xpath("//input[@class='form-control custom_increment_id SOManagementValidation']"))).click().keyDown(Keys.SHIFT).sendKeys("om").build().perform();
		a.click(driver.findElement(By.xpath("//a/button[normalize-space()='+ Create Sales Order']"))).build().perform();
	}

}
