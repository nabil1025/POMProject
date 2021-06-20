package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Element library
//	WebElement WebElement_USERNAME_FIELD = driver.findElement(By.xpath("//*[@id='username']"));
//	By USER_NAME_LOCATOR = By.xpath("//*[@id='username']");
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[2]/a") WebElement DASHBOARD_ELEMENT_FIELD;
	
	
	
	
	//Method to interact with the elements
	public void verifyDashBoardElemnt() {
		
		Assert.assertEquals(DASHBOARD_ELEMENT_FIELD.getText(), "Dashboard", "wrong page");
	}
	
}
