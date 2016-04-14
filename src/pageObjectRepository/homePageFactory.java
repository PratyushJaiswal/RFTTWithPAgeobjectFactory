package pageObjectRepository;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
	static Logger log = Logger.getLogger(homePageFactory.class);
	WebDriver driver;
	@FindBy(xpath = "//div[@class='rfer_btns_outr commom-btn']//a[Text() ='Refer a Patient'] ")
	WebElement referAPatient;
	
	public homePageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnReferAPatient(){
		referAPatient.click();
	}
	
	public void notification1(){
		referAPatient.click();
	}
	public void notification2(){
		referAPatient.click();
	}
	public void notification3(){
		referAPatient.click();
	}


}
