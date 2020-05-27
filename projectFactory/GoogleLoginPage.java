package projectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class GoogleLoginPage

{
	WebDriver driver;
	public GoogleLoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	WebElement search;
	
	@FindBy(className = "gNO89b")
	WebElement button;
	
	public WebElement search()
	{
		return search;
	}
	
	public WebElement button()
	{
		return button;
	}
	
	

}
