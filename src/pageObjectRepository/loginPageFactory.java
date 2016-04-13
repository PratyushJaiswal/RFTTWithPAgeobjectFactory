package pageObjectRepository;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class loginPageFactory {
	
	static Logger log = Logger.getLogger(loginPageFactory.class);

	WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='loginemailadress']")
	WebElement Login_Email_Address;
	
	@FindBy(xpath = ".//*[@id='DoctorHeaderLoginForm']/div[1]/div[2]/label/input")
	WebElement Login_Password;
	
	@FindBy(xpath = ".//*[@id='DoctorHeaderLoginForm']/button")
	WebElement Login_Login_Button;
	
	@FindBy(xpath = ".//*[@id='DoctorHeaderLoginForm']/div[2]/a")
	WebElement Login_Forgot_Password;
	
	@FindBy(xpath = "//a[text()='Join']")
	WebElement Login_Join_Button;
	
	@FindBy(xpath = ".//*[@id='popup_doctor_type']/div/div[1]/input")
	WebElement Login_GeneralDentist_Button;
	
	@FindBy(xpath = ".//*[@id='popup_doctor_type']/div/div[2]/input")
	WebElement Login_Specialist_Button;
	
	@FindBy(xpath = ".//*[@id='home_pop_close']/img")
	WebElement Login_Close_Button;
	
	@FindBy(xpath = ".//*[@id='myprofile_header']/div/div[2]/ul/li[4]/a")
	WebElement Logout;
	
	public loginPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertUserName(String username){
			Login_Email_Address.sendKeys(username);
			log.info("username is set as " + username );
	}
	
	public void insertPassword(String password){
		Login_Password.sendKeys(password);
		log.info("password entered is " + password );
	}
	
	public void clickLoginButton(){
		Login_Login_Button.click();
		log.info("clicked on login button");
	}
	
	public void clickForgotPassword(){
		Login_Forgot_Password.click();
		log.info("clicked on forgot button" );
	}
	
	public void loginJoinButton() {
		Login_Join_Button.click();
		log.info("Join button found " );
	}
	
	public void clickLoginGeneralDentistButton(){
		Login_GeneralDentist_Button.click();
		log.info("general select button found ");
	}
	
	public void clickLoginSpecialistButton() {
		Login_Specialist_Button.click();
	}
	
	public void clickLoginCloseButton (){
		Login_Close_Button.click();
	}
	
	public void clickLogout(){
		Logout.click();
	}
	
}
