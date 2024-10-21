package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class blockedsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		ChromeOptions optionss = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		optionss.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(optionss);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());


	}

}
