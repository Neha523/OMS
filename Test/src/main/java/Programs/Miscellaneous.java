package Programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Miscellaneous {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://protadev.medikabazaar.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("neha.sharma@medikabazaar.com");
		driver.findElement(By.id("password")).sendKeys("Medika@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println(driver.getCurrentUrl());
		TakesScreenshot image=((TakesScreenshot)driver);
        File images=image.getScreenshotAs(OutputType.FILE);
        File dest=new File("D://Screenshotsselenium/image1.jpg");
        FileUtils.copyFile(images, dest);
	}

}
