package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.launchBrowser();
		
		//LoginPage login = new LoginPage();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enteruserName("demo@techfios.com");
		login.enterPassWord("abc123");
		login.clickSignIn();
		
		
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifyDashBoardElemnt();
		
		BrowserFactory.tearDown();
	}

}
