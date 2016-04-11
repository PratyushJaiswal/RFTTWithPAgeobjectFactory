package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class headerPageFactory {
////li[@id='notification_li']
	WebDriver driver;
	@FindBy(xpath = "//li[@id='notification_li']")
	WebElement notificationtab;
	
	@FindBy(xpath = "//div[@id='myprofile_header']//div[@class='menu']//ul//li[3]")
	WebElement My_Account;
	
	@FindBy(xpath = "//div[@id='myprofile_header']//div[@class='menu']//ul//li[4]")
	WebElement logout;
	
	@FindBy(linkText = "About")
	WebElement About;
	
	@FindBy(linkText = "FAQ")
	WebElement FAQ_link;
	
	@FindBy(linkText = "Contact Us")
	WebElement Contact_Us_link;
	
	public headerPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void notification(){
		notificationtab.click();
	}
	
	public void My_Account(){
		My_Account.click();
	}
	
	public void About_link(){
		About.click();
	}
	
	public void FAQ_link(){
		FAQ_link.click();
	}
	
	public void Contact_us(){
		Contact_Us_link.click();
	}
	
	public void logout(){
		logout.click();
	}
}
