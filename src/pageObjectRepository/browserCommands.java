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
		driver.navigate().back();
	}
	
	public void clickForward(){
		driver.navigate().forward();
	}
	
	public void refresh(){
		driver.navigate().refresh();
	}
	
	public void closeWindow(){
		driver.close();
	}
	

}
