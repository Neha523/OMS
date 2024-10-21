package Abstract;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginlocators {
	
	 WebDriver driver;
	 

	public Loginlocators(WebDriver driver)
	{
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="remember")
	WebElement Remeemberme;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Loginbutton;
	
	public void loginurl()
	{
		driver.get("https://protadev.medikabazaar.com/login");

	}
	
	public void Login(String name,String pass)
	{
		username.sendKeys(name);
		password.sendKeys(pass);
		Remeemberme.click();
		Loginbutton.click();
		
	}
	

}
