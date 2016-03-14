package pageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class profileInfoBasicInfo {
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='DoctorFirstName']")
	WebElement First_Name;
	
	
	@FindBy(xpath=".//*[@id='DoctorLastName']")
	WebElement Last_Name;
	
	
	@FindBy(xpath=".//*[@id='Qualification1SchoolName']")
	WebElement Dental_School;
	
	
	@FindBy(xpath=".//*[@id='sbSelector_83550246']")
	WebElement Degree;
	
	
	@FindBy(xpath=".//*[@id='sbSelector_96776459']")
	WebElement Year;
	
	
	@FindBy(xpath=".//*[@id='Qualification0SchoolName']")
	WebElement Additional_School;
	
	
	@FindBy(xpath=".//*[@id='sbSelector_10005748']")
	WebElement Degree_AS;
	
	
	@FindBy(xpath=".//*[@id='sbSelector_45665563']")
	WebElement Year_AS;
	
	
	@FindBy(xpath=".//*[@id='basic_wrapper']/div[1]/div/div/div[8]/div[2]/div/div/button']")
	WebElement Membership;
	
	
	@FindBy(xpath=".//*[@id='ui-multiselect-DoctorMembershipId-option-2']")
	WebElement Membership_Select_Checkbox;
	
	
	@FindBy(xpath=".//*[@id='DoctorOtherMembership']")
	WebElement Other_Memberships;
	

	@FindBy(xpath=".//*[@id='basic_wrapper']/div[2]/div/a[2]")
	WebElement Save_and_Finish;
	
	
	@FindBy(xpath=".//*[@id='basic_wrapper']/div[2]/div/a[1]")
	WebElement Continue;
	
	
	@FindBy(xpath="html/body/p")
	WebElement Enter_Description;
	
	
	@FindBy(xpath=".//*[@id='bio_wrapper']/div[2]/div/a[1]")
	WebElement Bio_Back_Button;
	
	
	@FindBy(xpath=".//*[@id='bio_wrapper']/div[2]/div/a[3]")
	WebElement Bio_Save_and_Finish_Button;
	
	
	@FindBy(xpath=".//*[@id='bio_wrapper']/div[2]/div/a[2]")
	WebElement Bio_Continue_Button;
	
	
	@FindBy(xpath=".//*[@id='DoctorPracticeName']")
	WebElement Practice_Name;
	
	
	@FindBy(xpath=".//*[@id='DoctorServices']")
	WebElement Services_Offered;
	
	
	@FindBy(xpath=".//*[@id='upload_logo_pic']/div/div[2]/input")
	WebElement Upload_Logo;
	
	
	@FindBy(xpath=".//*[@id='DoctorDentalPracticeUrl']")
	WebElement Dental_Practice_url;
	
	
	@FindBy(xpath=".//*[@id='DoctorNotificationEmailid']")
	WebElement Notification_Email;
	
	
	@FindBy(xpath=".//*[@id='dental_wrapper']/div[1]/div/div[1]/div[1]/div[6]/div[2]/div/button")
	WebElement Languages;
	
	
	@FindBy(xpath=".//*[@id='ui-multiselect-DoctorLanguageId-option-1']")
	WebElement Languages_Options;
	
	
	@FindBy(xpath=".//*[@id='DoctorAccepted']/option[5]")
	WebElement Accepted_Insurance;
	
	@FindBy(xpath=".//*[@id='dental_wrapper']/div[1]/div/div[1]/div[2]/div[3]")
	WebElement Insurance_Add_Button;
	
	@FindBy(xpath=".//*[@id='DoctorSelected']")
	WebElement Selected_Insurance;
	
	
	@FindBy(xpath=".//*[@id='dental_wrapper']/div[1]/div/div[1]/div[2]/div[4]")
	WebElement Insurance_Remove_Button;
	
	
	@FindBy(xpath=".//*[@id='DoctorVideoUrl']")
	WebElement Youtube_url;
	
	
	public void registerPageFactory2(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Here will be methods name which we are going to call in the framework classes for testing if the element text box the method 
	// starts with insert if elemnt clickable it will start with click 
		
		public void insertFirstName(String name){
			First_Name.sendKeys(name);
		}
		
		public void insertLastName(String name){
			Last_Name.sendKeys(name);
		}
		
		public void insertDentalSchool(String name){
			Dental_School.sendKeys(name);
		}
		
		//Dropdown Selection
		public void Degree(String dropdownText){
			Select sel1 = new Select(Degree);
			sel1.selectByVisibleText(dropdownText);
			//Degree.sendKeys(name);
		}
		
		//Dropdown Selection
		public void insertYear(String name){
			Select sel1 = new Select(Year);
			sel1.selectByVisibleText(name);
			//Year.sendKeys(name);
		}
		
		public void insertAdditional_School(String name){
			Additional_School.sendKeys(name);
		}
		
		//Dropdown Selection
		public void selectDegree_AS(String name){
			Select sel1 = new Select(Degree_AS);
			sel1.selectByVisibleText(name);
			//Degree_AS.sendKeys(name);
		}
        
		//Dropdown Selection
		public void selectYear_Ad(String name){
			Select sel1 = new Select(Year_AS);
			sel1.selectByVisibleText(name);
			//Year_AS.sendKeys(name);
		}
        
		//Dropdown Selection with checkbox
		public void insertMembership(String name){
			Membership.sendKeys(name);
		}

		public void insertMembership_Select_Checkbox(String name){
			Membership_Select_Checkbox.sendKeys(name);
		}

		public void insertOther_Memberships(String name){
			Other_Memberships.sendKeys(name);
		}
		
		public void clickSave_and_Finish(){
			Save_and_Finish.click();

		}
		
		public void clickContinue(){
			Continue.click();
		}
		
		public void insertEnter_Description(String name){
			Enter_Description.sendKeys(name);
		}
		
		public void clickBio_Back_Button(){
			Bio_Back_Button.click();
		}
		
		public void clickBio_Save_and_Finish_Button(){
			Bio_Save_and_Finish_Button.click();
		}
		
		public void clickBio_Continue_Button(){
			Bio_Continue_Button.click();
		}
		
		public void insertPractice_Name(String name){
			Practice_Name.sendKeys(name);
		}
		
		public void insertServices_Offered(String name){
			Services_Offered.sendKeys(name);
		}
		
		public void insertUpload_Logo(String name){
			Upload_Logo.sendKeys(name);
		}
		public void Dental_Practice_url(String name){
			Dental_Practice_url.sendKeys(name);
		}
		public void clickNotification_Email(){
			Notification_Email.click();
		}
		public void insertLanguages(String name){
			Languages.sendKeys(name);
		}
		public void insertLanguages_Options(String name){
			Languages_Options.sendKeys(name);
		}
		
		public void insertAccepted_Insurance(String name){
			Accepted_Insurance.sendKeys(name);
		}
		public void insertInsurance_Add_Button(String name){
			Insurance_Add_Button.sendKeys(name);
		}
		public void insertSelected_Insurance(String name){
			Selected_Insurance.sendKeys(name);
		}
		public void insertInsurance_Remove_Button(String name){
			Insurance_Remove_Button.sendKeys(name);
		}
		public void insertYoutube_url(String name){
			Youtube_url.sendKeys(name);
		}
}
