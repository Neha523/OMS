package Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invokewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> tab=driver.getWindowHandles();
		Iterator<String> it=tab.iterator();
		String parent=it.next();
        String child=it.next();
        driver.switchTo().window(child);
        driver.get("https://courses.rahulshettyacademy.com/courses/");
        String s=driver.findElement(By.cssSelector("div[title='Angular Fundamentals from Scratch & Unit/Integration Testing']")).getText();
        System.out.println(s);
        driver.switchTo().window(parent);
        driver.findElement(By.name("name")).sendKeys(s);
	}

}
