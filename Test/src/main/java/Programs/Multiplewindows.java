package Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> It=windows.iterator();
		String parent=It.next();
		driver.switchTo().window(parent);
		String s=driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).getText();
		System.out.println(s);
		driver.switchTo().window(parent);
		String ss=driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).getText();
		System.out.println(ss);
		
		

	}

}
