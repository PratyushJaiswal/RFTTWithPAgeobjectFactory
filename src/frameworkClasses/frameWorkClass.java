package frameworkClasses;

import java.util.concurrent.TimeUnit;

import utilities.*;
import pageObjectRepository.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
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
	headerPageFactory headerpageFactory;
	browserCommands browserCommands;
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
		
	}
	
	public void login(){
		loginPage.insertUserName("daniel@yopmail.com");
		loginPage.insertPassword("12345678");
		loginPage.clickLoginButton();
	}
	public void logout(){
		loginPage.clickLogout();
	}
	
	@Test
	public void navigationLoginPage() throws InterruptedException{
		//login("daniel@yopmail.com","12345678");
		//browserCommands.refresh();
		login();
		System.out.println("this is inside the message");
		Thread.sleep(1000);
		//headerpageFactory.notification();
		headerpageFactory.My_Account();
		browserCommands.clickBack();
		headerpageFactory.logout();
		login();
		headerpageFactory.About_link();
		browserCommands.clickBack();
		headerpageFactory.Contact_us();
		browserCommands.clickBack();
		headerpageFactory.FAQ_link();
		browserCommands.clickBack();
		
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
	
	@AfterMethod
	public void afterClass(){
		driver.quit();
	}
	

}
