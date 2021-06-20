package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	WebDriver driver;
	
	//Element library
//	WebElement WebElement_USERNAME_FIELD = driver.findElement(By.xpath("//*[@id='username']"));
//	By USER_NAME_LOCATOR = By.xpath("//*[@id='username']");
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGN_IN_FIELD;
	
	
	
	
	//Method to interact with the elements
	public void enteruserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}
	public void enterPassWord(String passWord) {
		PASSWORD_FIELD.sendKeys(passWord);
	}
	public void clickSignIn() {
		SIGN_IN_FIELD.click();
	}
	
	
}
