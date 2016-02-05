
import java.util.concurrent.TimeUnit;
import utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class frameWorkClass {
	private WebDriver driver;
	private String baseUrl;
	loginPageFactory loginPage;
	registerPageFactory1 registerPage;
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		//baseUrl = "https://testrtt.softwaydev.com/version_8/";
		
		loginPage = new loginPageFactory(driver);
		registerPage = new registerPageFactory1(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		
		
	}
	
	@Test
	public void login(){
		
		loginPage.insertUserName("daniel@yopmail.com");
		loginPage.insertPassword("12345678");
		loginPage.clickLoginButton();
		loginPage.clickLogout();
	}
	
	@Test
	public void T1(){
		loginPage.insertUserName("daniel@yopmail.com");
		loginPage.insertPassword("12345678");
		loginPage.clickLoginButton();
		registerPage.clickCant_Find_Click_Here();
		
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
	}
	

}
