package Programs;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for (int i=1;i<5;i++)
		{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt'][1]")).click();
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> optionss= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option: optionss)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{
				System.out.println(option.getText());

				option.click();
				break;
			}
		
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.close();
	}     

}
