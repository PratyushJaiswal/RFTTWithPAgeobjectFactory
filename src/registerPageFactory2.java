import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class registerPageFactory2 {
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='license_pop_close']/img")
	WebElement name_of_element_in_or_text_file;
	
	public registerPageFactory2(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		//Here will be methods name which we are going to call in the framework classes for testing 
		
		public void methodName(String name){
			name_of_element_in_or_text_file.sendKeys(name);
		}
		
	

}
