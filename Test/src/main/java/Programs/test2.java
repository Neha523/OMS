package Programs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().avoidBrowserDetection().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("QA Tester");
		driver.findElement(By.name("email")).sendKeys("qatest@yopmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Testme@123");
		driver.findElement(By.id("exampleCheck1")).click();
	    Select a= new Select(driver.findElement(By.id("exampleFormControlSelect1")));
	    a.selectByVisibleText("Female");
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.name("bday")).sendKeys("29-11-2023");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	    String expmsg1 ="Success!";
	    String actmsg1=driver.findElement(By.xpath("(//strong[normalize-space()='Success!'])[1]")).getText();
	    System.out.println(actmsg1);
	    assertEquals(actmsg1, expmsg1);
	    driver.close();
	    
	    		
	    
		
	}

}
