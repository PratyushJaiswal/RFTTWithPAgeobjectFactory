package frameworkClasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjectRepository.homePageFactory;
import pageObjectRepository.loginPageFactory;
import pageObjectRepository.makeARPageFactory;
import utilities.Constants;

public class referralFlow {
	static Logger log = Logger.getLogger(RegisterationPageFramework.class);
	private WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	loginPageFactory login;
	homePageFactory homepage;
	makeARPageFactory MARP;
	
	@Parameters("browserType")
	@BeforeClass
	  public void beforeClass(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C://Users//Pratyush//git//RFTTWithPAgeobjectFactory//driver//chromedriver.exe" );
			driver = new ChromeDriver();
		}
		driver.get(Constants.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("src/utilities/log4j.properties");
		
		
		
	  }
	@Test
	public void testFlow() throws InterruptedException{
		/*System.out.println(Constants.UserName);
		Thread.sleep(2000);
		login.insertUserName(Constants.UserName);
		login.insertPassword(Constants.Password);*/
		login.clickLoginButton();
		homepage.clickOnReferAPatient();
		MARP.insertFirstName("praka");
		MARP.insertLastName("JAisa");
		MARP.insertMobileNo("1234567890");
		MARP.insertEmailId("praka@yopmail.com");
		MARP.clickContinue1Btn();
		MARP.selectSFMDocter();
		MARP.selectprocedure("");
		MARP.selecttooth("");
		MARP.insertComment("This is the test");
		MARP.selectNo();
	}
	
	@AfterClass
	  public void afterClass() {
			driver.close();
	  }

}
