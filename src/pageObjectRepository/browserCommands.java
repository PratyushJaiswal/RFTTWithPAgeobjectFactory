package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class browserCommands {
	WebDriver driver;
	
	public void registerPageFactory2(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickBack(){
		
	}
	
	public void refresh(){
		
	}
	
	public void closeWindow(){
		
	}
	

}
