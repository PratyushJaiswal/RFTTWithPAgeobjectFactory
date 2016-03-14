

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import pageObjectRepository.loginPageFactory;
import pageObjectRepository.profileInfoBasicInfo;
import pageObjectRepository.registerPageFactory1;
import utilities.Constants;
import utilities.ExcelUtils;

public class NewTest {
	private WebDriver driver;
	
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
	@DataProvider 
	public Object[][] excel() throws Exception {
		Object[][] testObjArray1= ExcelUtils.getTableArray(Constants.File_Path, "Sheet2");
		return(testObjArray1);
	}
	
	@Test(dataProvider = "excel")
	public void mLogin (String userName, String password) throws Exception{
		Thread.sleep(1000);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickLoginButton();
	}
	
	
}
