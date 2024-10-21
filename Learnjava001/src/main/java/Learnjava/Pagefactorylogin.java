package Learnjava;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import locators.Cartlocator;
import locators.LandingpageLocator;

public class Pagefactorylogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		LandingpageLocator Landing=new LandingpageLocator(driver);
		Landing.url();
		Landing.login("nehatest1689@gmail.com", "Testme@123");
		driver.manage().window().maximize();
		Cartlocator items=new Cartlocator(driver);
		items.cart();
		
	}

}
