package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import projectspecific.ProjectSpecificMethods;


public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test, ExtentTest node) {
		this.driver = driver;
		this.test = test;
		this.node = node;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="username") WebElement eleUserName;
	@FindBy(how=How.ID, using="password") WebElement elePassword;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;
	
	public LoginPage enterUsername(String userName) {
		//eleUserName.sendKeys(userName);
		clearAndType(eleUserName, userName);
		reportStep("User Name entered", "pass", true);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		clearAndType(elePassword, password);
		reportStep("User Name entered", "pass", true);
		return this;
	}
	
	public HomePage clickLogin() {
		//eleLogin.click();
		click(eleLogin);
		reportStep("User Name entered", "pass", true);
		return new HomePage(driver);
	}
}
