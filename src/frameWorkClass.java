
import java.util.concurrent.TimeUnit;

import utilities.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class frameWorkClass {
	private WebDriver driver;
	private String sTestCaseName;
	 
	private int iTestCaseRow;
	//private String baseUrl;
	loginPageFactory loginPage;
	registerPageFactory1 registerPage;
	profileInfoBasicInfo profileinfo;
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		//baseUrl = "https://testrtt.softwaydev.com/version_8/";
		
		loginPage = new loginPageFactory(driver);
		registerPage = new registerPageFactory1(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		
		
	}
	
	@Test(dataProvider = "Authentication")
	public void login(String userName, String password){
		System.out.println(userName);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickLoginButton();
		if (true){
			loginPage.clickLogout();
		}
	}
	
	@Test(dataProvider = "Authentication")
	public void T1(String userName, String password){
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickLoginButton();
		registerPage.clickCant_Find_Click_Here();
		
	}
	
	 @DataProvider
	 
	  public Object[][] Authentication() throws Exception{
	 
		    // Setting up the Test Data Excel file
		 ExcelUtility.setExcelFile(Constants.File_Path, "Sheet2");
		 sTestCaseName = this.toString();
		 
		 sTestCaseName = ExcelUtility.getTestCaseName(this.toString());
		 
		 iTestCaseRow = ExcelUtility.getRowContains(sTestCaseName, 0);
		 System.out.println(iTestCaseRow);
	 
		 	
		    Object[][] testObjArray = ExcelUtility.getTableArray(Constants.File_Path,"Sheet2",iTestCaseRow);
	 
		    	return (testObjArray);
		    	
			}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
	}
	

}
