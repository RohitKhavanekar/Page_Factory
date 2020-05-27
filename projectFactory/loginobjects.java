package projectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class loginobjects 
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=wnuwV-O5MKXT8gebroGIAQ");
		
		GoogleLoginPage go = new GoogleLoginPage(driver);
		go.search().sendKeys("boat242");
		go.button().click();
	}

}
