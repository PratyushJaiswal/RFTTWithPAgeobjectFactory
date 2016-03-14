package pageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class registerPageFactory1 {
WebDriver driver;
	
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
	
	public registerPageFactory1(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertDocterFullName(String name){
		Providers_Name_GD.sendKeys(name);
	}
	
	public void clickCant_Find_Click_Here(){
		Providers_Name_GD.click();
	}
	
	public void insertDocterEmailAddress(String email){
		GD_Confirm_Email_Address.sendKeys(email);
	}
	
	public void clickGD_NPI_Number_Locate_Click_Here(){
		GD_NPI_Number_Locate_Click_Here.click();
	}
	
	public void clickDocterEmailAddress(){
		GD_NPI_Close_bar.click();
	}
}
