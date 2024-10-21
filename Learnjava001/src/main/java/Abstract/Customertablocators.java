package Abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customertablocators {
	
	 WebDriver driver;
	 

		public Customertablocators(WebDriver driver)
		{
			this.driver=driver;
			 PageFactory.initElements(driver, this);
		}
		
@FindBy(xpath="//a[normalize-space()='Customers']")
WebElement Customertab;
@FindBy(xpath="//a[normalize-space()='Customer Master']")
WebElement Customermaster;
@FindBy(xpath="//button[normalize-space()='Add Customer']")
WebElement Addcustomer;


}
