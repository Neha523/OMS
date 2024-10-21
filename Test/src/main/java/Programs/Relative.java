package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import org.openqa.selenium.By;;

public class Relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name=driver.findElement(By.name("name"));
		WebElement label=driver.findElement(RelativeLocator.with(By.xpath("//label[normalize-space()='Name']")).above(name));
		System.out.println(label.getText());
		WebElement above=driver.findElement(By.xpath("//input[@value='Submit']"));
		WebElement text=driver.findElement(RelativeLocator.with(By.xpath("//h4[normalize-space()='Two-way Data Binding example:']")).below(above));
		System.out.println(text.getText());

	}


}
