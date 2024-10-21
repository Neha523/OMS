package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract.Abstractclass;

public class LandingpageLocator extends Abstractclass
{   
	WebDriver driver;
	public LandingpageLocator(WebDriver driver)
	{   
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement useremail=driver.findElement(By.id("userEmail"));
    //pageFactoory
	@FindBy(id="userEmail")
	WebElement useremail;
	@FindBy(id="userPassword")	
	WebElement password;
	@FindBy(id="login")
	WebElement Button;
	
	public void login(String useremaill,String passwordd)
	{
		useremail.sendKeys(useremaill);
		password.sendKeys(passwordd);
		Button.click();
	}
	public void url()
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}

}
