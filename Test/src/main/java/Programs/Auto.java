package Programs;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//input[@placeholder=\"Type to Select Countries\"]")).sendKeys("IND");
		Actions s= new Actions(driver);
		s.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"))).click().sendKeys("IND").keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).click().build().perform();
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).getAttribute("value"));
		}

}
