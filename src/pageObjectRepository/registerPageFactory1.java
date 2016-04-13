package pageObjectRepository;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;


public class registerPageFactory1 {
	WebDriver driver;
	static Logger log = Logger.getLogger(registerPageFactory1.class);
	
	@FindBy(xpath = ".//*[@id='doctorFullName']")
	WebElement Providers_Name_GD;
	
	@FindBy(xpath = ".//*[@id='DoctorRegisterForm']/div[1]/div/div[3]/a")
	WebElement Cant_Find_Click_Here;
	
	@FindBy(xpath = ".//*[@id='DoctorLoginEmail']")
	WebElement GD_Email_Address;
	
	@FindBy(xpath = ".//*[@id='DoctorRegisterForm']/div[1]/div/div[4]/div/div[2]/div/input")
	WebElement GD_Confirm_Email_Address;
	
	@FindBy(xpath = ".//*[@id='DoctorPassword']")
	WebElement GD_Password;
	
	@FindBy(xpath = ".//*[@id='DoctorRegisterForm']/div[1]/div/div[5]/div/div[2]/div/input")
	WebElement GD_Confirm_PAssword;
	
	@FindBy(xpath = ".//*[@id='thing']")
	WebElement GD_I_Agree_Checkbox;
	
	@FindBy(xpath = ".//*[@id='DoctorRegisterForm']/div[1]/div/div[7]/a[1]")
	WebElement GD_Terms_Conditions;
	
	@FindBy(xpath = ".//*[@id='DoctorRegisterForm']/div[1]/div/div[7]/a[2]")
	WebElement GD_Privacy_Policy;
	
	@FindBy(xpath = ".//*[@id='DoctorRegisterForm']/div[2]/div/a")
	WebElement GD_Continue_Button;
	
	@FindBy(xpath = ".//*[@id='license_number_text']")
	WebElement GD_NPI_Number;
	
	@FindBy(xpath = ".//*[@id='DoctorLicenseNumberForm']/div[3]/a")
	WebElement GD_NPI_Number_Submit;
	
	@FindBy(xpath = ".//*[@id='DoctorLicenseNumberForm']/div[4]/a")
	WebElement GD_NPI_Number_Locate_Click_Here;
	
	@FindBy(xpath = ".//*[@id='license_pop_close']/img")
	WebElement GD_NPI_Close_bar;
	
	@FindBy(xpath = "//div[@class='trms_backbtn_outr']//a[text()='Close']")
	WebElement GD_popup_Close_btn;
	
	public registerPageFactory1(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertDocterFullName(String name){
		Providers_Name_GD.sendKeys(name);
		log.info("Name set as "+ name);
	}
	
	public void clickCant_Find_Click_Here(){
		Providers_Name_GD.click();
	}
	
	public void insertDocterEmailAddress(String email){
		GD_Email_Address.sendKeys(email);
	}
	
	public void insertConfirmDocterEmailAddress(String email){
		GD_Confirm_Email_Address.sendKeys(email);
	}
	
	public void insertPassword(String password){
		GD_Password.sendKeys(password);
		log.info("Password entered as " + password);
	}
	
	public void insertConfirmPassword(String password){
		GD_Confirm_PAssword.sendKeys(password);
		log.info("Confirm password entered as " + password);
	}
	
	public void clickGD_NPI_Number_Locate_Click_Here(){
		GD_NPI_Number_Locate_Click_Here.click();
	}
	
	public void clickDocterEmailAddress(){
		GD_NPI_Close_bar.click();
	}
	
	public void clickCheckBox(){
		GD_I_Agree_Checkbox.click();
		log.info("Check box found");
	}
	
	public void clickT_CLink(){
		GD_Terms_Conditions.click();
		log.info("T&C link found and clicked");
	}
	
	public void clickPrivacyLink(){
		GD_Privacy_Policy.click();
		log.info("Privacy policy clicked");
	}
	
	
	
	public void clickContinue(){
		//WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated((By) GD_Continue_Button)));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(GD_popup_Close_btn));
		GD_Continue_Button.click();
		log.info("Clicked on Continue button");
	}
	
	public void clickPopupBtn(){
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
}
