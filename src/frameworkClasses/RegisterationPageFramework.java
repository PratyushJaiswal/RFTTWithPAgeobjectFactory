package frameworkClasses;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import pageObjectRepository.browserCommands;
import pageObjectRepository.loginPageFactory;
import pageObjectRepository.registerPageFactory1;
import pageObjectRepository.registerPageFactory2;
import utilities.Constants;


public class RegisterationPageFramework {
	static Logger log = Logger.getLogger(RegisterationPageFramework.class);
	private WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	registerPageFactory1 register1;
	registerPageFactory2 register2; 
	loginPageFactory login;
	browserCommands navigate;
	
	@Parameters("browserType")
	@BeforeClass
	  public void beforeClass(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C://Users//Pratyush//git//RFTTWithPAgeobjectFactory//driver//chromedriver.exe" );
			driver = new ChromeDriver();
		}
		
		
		register1 = new registerPageFactory1(driver);
		register2 = new registerPageFactory2(driver);
		login = new loginPageFactory(driver);
		driver.get(Constants.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("src/utilities/log4j.properties");
		
		
		
	  }
	
	@Test(priority=0)
  public void navigate_to_Register() {
		login.loginJoinButton();
		login.clickLoginGeneralDentistButton();
  }
	
	@Test(dependsOnMethods = {"navigate_to_Register", "navigation_to_links"})
	public void register_register1withoutsearch(){
		
		register1.insertDocterFullName("Pratyush");
		register1.insertDocterEmailAddress("pratyush@yopmail.com");
		register1.insertConfirmDocterEmailAddress("pratyush@yopmail.com");
		register1.insertPassword("12345");
		register1.insertConfirmPassword("1234567");
		register1.clickCheckBox();
		register1.clickContinue();
		
	}
	
	@Test
	public void navigation_to_links() throws InterruptedException{
		
		register1.clickPrivacyLink();
		
		String parentHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String handle: handles) {
			if (!handle.equals(parentHandle)) {
				// Switch to the new window
				driver.switchTo().window(handle);
				System.out.println("in the loop or not :)");
				register1.clickPopupBtn();
				driver.switchTo().window(parentHandle);
				Thread.sleep(2000);
			}
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
	}
  

	@AfterClass
  public void afterClass() {
		driver.close();
  }

}
