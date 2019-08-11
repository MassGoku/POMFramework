package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectspecific.ProjectSpecificMethods;


public class TC_001_Login extends ProjectSpecificMethods{

	@BeforeTest
	public void setTestData() {
		
		excelFileName = this.getClass().getSimpleName();
		testcaseName = this.getClass().getSimpleName();
		testcaseDec = this.getClass().getSimpleName();
		author = "Azar";
		category = "SIT";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String companyName, String firstName, String lastName)
	{
		new LoginPage(driver, test, node)
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin();
	}
}
