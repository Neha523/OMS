package Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement s=driver.findElement(By.id("gf-BIG"));
		System.out.println(s.findElements(By.tagName("a")).size());
		WebElement ss=s.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(ss.findElements(By.tagName("a")).size());
		for (int i=1;i<ss.findElements(By.tagName("a")).size();i++)
		{   String click =Keys.chord(Keys.CONTROL,Keys.ENTER);
			ss.findElements(By.tagName("a")).get(i).sendKeys(click);
			
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		
		for(int i=0;i<4;i++)
		{
			String child=it.next();
			System.out.println(driver.switchTo().window(child).getTitle());
		

	}}

	public static String getAttribute(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
