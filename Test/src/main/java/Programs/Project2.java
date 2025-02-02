package Programs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.findElement(By.cssSelector("input.search-keyword")).sendKeys("Cauliflower - 1 Kg");
		driver.findElement(By.cssSelector("button.search-button")).click();
		String productnameexp="Cauliflower - 1 Kg";
		 driver.findElement(By.xpath("//h4[normalize-space()='Cauliflower - 1 Kg']")).getSize();
		String productnameact= driver.findElement(By.xpath("//h4[normalize-space()='Cauliflower - 1 Kg']")).getText();
		System.out.println(productnameact);
		Assert.assertEquals(productnameexp,productnameact );
		driver.findElement(By.xpath("//div/input[@class='quantity']")).sendKeys("2");
		driver.findElement(By.xpath("//div[@class='product-action']")).click();
		
		
		
		

	}

}
