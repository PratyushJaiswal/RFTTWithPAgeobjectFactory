import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
		
		public void insertDegree(String name){
		Degree.sendKeys(name);
		}
		
		public void insertYear(String name){
		Year.sendKeys(name);
		}
		
		public void insertAdditional_School(String name)
		{
			Additional_School.sendKeys(name);
		}
		
		public void insertDegree_AS(String name)
		{
			Degree_AS.sendKeys(name);
		}

		public void insertYear_Ad(String name)
		{
			Year_AS.sendKeys(name);
		}

		public void insertMembership(String name)
		{
			Membership.sendKeys(name);
		}

		public void insertMembership_Select_Checkbox(String name)
		{
			Membership_Select_Checkbox.sendKeys(name);
		}

		public void insertOther_Memberships(String name)
		{
			Other_Memberships.sendKeys(name);
		}
		
		public void clickSave_and_Finish()
		{
			Save_and_Finish.click();

		}
		
		public void clickContinue()
		{
			Continue.click();
		}
		public void insertEnter_Description(String name)
		{
			Enter_Description.sendKeys(name);
		}
		
		public void clickBio_Back_Button()
		{
			Bio_Back_Button.click();
		}
		public void clickBio_Save_and_Finish_Button()
		{
			Bio_Save_and_Finish_Button.click();
		}
		public void clickBio_Continue_Button()
		{
			Bio_Continue_Button.click();
		}
}
