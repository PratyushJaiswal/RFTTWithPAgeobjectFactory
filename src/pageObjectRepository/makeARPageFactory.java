package pageObjectRepository;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class makeARPageFactory {
	static Logger log = Logger.getLogger(makeARPageFactory.class);
	WebDriver driver;
	// MAR first page web elements 
	@FindBy(id = "PatientFirstName")
	WebElement patientFirstName;
	
	@FindBy(id = "PatientLastName")
	WebElement patientLastName;
	
	@FindBy(id = "PatientMobile")
	WebElement patientMobile;
	
	@FindBy(id = "PatientEmailId")
	WebElement patientEmailId;
	
	@FindBy (id ="ReferralReferForm-next-0")
	WebElement continuBtn;
	
	//MAR 2nd page 
	@FindBy (xpath = "//div[@class='mke_rfrl_centr1']//ul/li[@title='Dr. Samir Batniji - Diamond Bar, California']")
	WebElement SFMNetwork;
	
	@FindBy (id = "sbSelector_88396170")
	WebElement selectProcedure;
	
	@FindBy (id = "toothheader")
	WebElement selectTooth;
	
	@FindBy (id = "comment1")
	WebElement comments;
	
	@FindBy (xpath = ".//*[@id='checkbox_outer']/label[2]/span/div/label")
	WebElement checkNo;
	
	@FindBy (xpath = ".//*[@id='checkbox_outer']/label[1]/span/div/label")
	WebElement checkYes;
	
	@FindBy (id = "ReferralReferForm-next-1")
	WebElement continueNext;
	
	@FindBy(id = "ReferralReferForm-back-1")
	WebElement back;
	
	public makeARPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertFirstName(String name){
		patientFirstName.sendKeys(name);
	}
	
	public void insertLastName(String Lname){
		patientLastName.sendKeys(Lname);
	}
	
	public void insertMobileNo(String mobile){
		patientMobile.sendKeys(mobile);
	}
	
	public void insertEmailId(String email){
		patientEmailId.sendKeys(email);
	}
	
	public void clickContinue1Btn(){
		continuBtn.click();
	}
	
	public void selectSFMDocter(){
		SFMNetwork.click();
	}
	
	public void selectprocedure(String procedureName){
		
		Select dropdown = new Select(selectProcedure);
		dropdown.selectByVisibleText(procedureName);
	}
	
	public void selecttooth(String tooth){
		Select dropdown = new Select(selectTooth);
		dropdown.deselectByVisibleText(tooth);
	}
	
	public void insertComment(String comment){
		comments.sendKeys(comment);
	}
	
	public void selectYes(){
		checkYes.click();
	}
	
	public void selectNo(){
		checkNo.click();
	}
	
	public void clickContinue2btn(){
		continueNext.click();
	}
	
	public void clickBack(){
		back.click();
	}

}
