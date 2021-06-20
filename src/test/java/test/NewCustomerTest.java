package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import page.NewCustomerPage;
import util.BrowserFactory;

public class NewCustomerTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddNewCustomer() {
		driver = BrowserFactory.launchBrowser();
		
		//LoginPage login = new LoginPage();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enteruserName("demo@techfios.com");
		login.enterPassWord("abc123");
		login.clickSignIn();
		
		
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifyDashBoardElemnt();
		
		NewCustomerPage newCustomer = PageFactory.initElements(driver, NewCustomerPage.class);
		newCustomer.clickCustomerButton();
		newCustomer.insertNameField("Nabil");
		newCustomer.selectCompanyDropDownField();
		newCustomer.insertAddress("9050");
		newCustomer.insertZipcode("11373");
		newCustomer.selectCountryField();
		newCustomer.clickSaveButton();
		
		
		//BrowserFactory.tearDown();
	}


}
