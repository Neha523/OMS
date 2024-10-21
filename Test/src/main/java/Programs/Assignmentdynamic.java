package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String s=driver.findElement(By.id("checkBoxOption3")).getAttribute("value");
		System.out.println(s);
		Select dropdown=new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue(s);
		driver.findElement(By.name("enter-name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();
		String variable=driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		System.out.println(variable);
		Assert.assertEquals(s, variable);
		driver.switchTo().alert().dismiss();
		driver.close();
		   
	}

}
