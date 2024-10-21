package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocator {

//WebDriver driver;
//	
//	//Constructor that will be automatically called as soon as the object of the class is created
//	public LoginLocator(WebDriver driver) {
//		this.driver=driver;
//	}

	@FindBy(xpath = "//button[@class='btn login']")
	private WebElement Toplogin;

	@FindBy(id = "email")
	private WebElement Email;
	@FindBy(id = "password")
	private WebElement Password;

	@FindBy(xpath = "//input[@name='remember']")
	private WebElement Remember;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block']")
	private WebElement Userlogin;

	public WebElement getToplogin() {
		return Toplogin;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getRemember() {
		return Remember;
	}

	public WebElement getUserlogin() {
		return Userlogin;
	}

	public LoginLocator(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void Loginapp(String username, String password) {
		Toplogin.click();
		Email.sendKeys(username);
		Password.sendKeys(password);
		Remember.click();
		Userlogin.click();

	}

}
