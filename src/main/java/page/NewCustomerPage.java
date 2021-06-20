package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NewCustomerPage extends BasePage {
	
WebDriver driver;
	
	public NewCustomerPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Element library
//	WebElement WebElement_USERNAME_FIELD = driver.findElement(By.xpath("//*[@id='username']"));
//	By USER_NAME_LOCATOR = By.xpath("//*[@id='username']");

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_BUTTON_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_DROPDOWN_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") WebElement ZIPCODE_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-country-container\"]") WebElement COUNTRY_DROPDOWN_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]") WebElement SAVE_BUTTON_FIELD;
	
	
	
	
	//Method to interact with the elements
	public void clickCustomerButton() {
		BasePage.waitForElement(driver, 3, By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]"));
		CUSTOMER_BUTTON_FIELD.click();
		}
	
	public void insertNameField(String description) {
		NAME_FIELD.sendKeys(description);}
	
	public void selectCompanyDropDownField() {
		Select sel = new Select (COMPANY_DROPDOWN_FIELD);
		sel.selectByVisibleText("Google");
	}
	public void insertAddress(String description) {
		ADDRESS_FIELD.sendKeys(description);}
	
	public void insertZipcode(String description) {
		ZIPCODE_FIELD.sendKeys(description);}
	
	public void selectCountryField() {
		Select sel = new Select (COUNTRY_DROPDOWN_FIELD);
		sel.selectByVisibleText("United States");
	}
	public void clickSaveButton() {
		SAVE_BUTTON_FIELD.click();}
	
	
	
}
