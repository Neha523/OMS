package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		Select stdropdown = new Select(dropdown);
		stdropdown.selectByValue("option1");
		System.out.println(stdropdown.getFirstSelectedOption().getText());
		stdropdown.selectByValue("option3");
		System.out.println(stdropdown.getFirstSelectedOption().getText());
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		

		}

}
