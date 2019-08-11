package projectspecific;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import base.SeleniumBase;
import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase{
	public String excelFileName;
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	startApp("chrome", "http://leaftaps.com/opentaps");
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }
  
  
  
  
  
  
  
  
  
  
  
  

}
