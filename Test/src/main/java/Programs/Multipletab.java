package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipletab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']")).click();
		Thread.sleep(10);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
	    driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		String s=driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(s);
		
		
		

	}

}
