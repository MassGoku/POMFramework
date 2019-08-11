package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import projectspecific.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods{
	
	RemoteWebDriver driver;
	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA") WebElement eleCRMSFA;
	
	/*public MyHomePage clickCRMSFA() {
		eleCRMSFA.click();
		return new MyHomePage(driver);
	}*/
}
