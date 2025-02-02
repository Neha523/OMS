package Programs;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		List<WebElement> productname=driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(productname.size());
		String[] Veggie= {"Cucumber - 1 Kg","Brinjal - 1 Kg","Capsicum"};
		for (int i=0;i<productname.size();i++)
		{
			String name= productname.get(i).getText();
			System.out.println(name);
			List<String> Veggies= Arrays.asList(Veggie);
			
			if (Veggies.contains(name))
			{
				driver.findElements(By.xpath("//div/button[contains(text(),'ADD TO CART')]")).get(i).click();
			}
			
		}
		
		  driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		  WebDriverWait waits= new WebDriverWait(driver, Duration.ofSeconds(20));
		  waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")));
		  driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		  driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		  driver.findElement(By.cssSelector("button.promoBtn")).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		  String alert=driver.findElement(By.cssSelector("span.promoInfo")).getText();
		  System.out.println(alert);
		  

	}

}
