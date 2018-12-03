package fb.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SendMessages {
	
	WebDriver driver;
	
	@FindBy(how = How.CLASS_NAME , using = "_1vp5")
	WebElement profileElement;
	
	@FindBy(how = How.CLASS_NAME , using = "_4-fs")
	WebElement newpostElement;
	
	@FindBy(how = How.XPATH , using = "//div[contains(@class,'_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _34nd _21mu _5yk1')]")
	WebElement postElement; 
	
	public SendMessages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}
	
	public void clickOnProfile(){
		profileElement.click();
	}
	
	public void postfb() {
		newpostElement.click();
	}
		
	public void fbpost(String status) throws InterruptedException {
		Thread.sleep(2000);
		postElement.click();
		//postElement.clear();
		postElement.sendKeys(status);
		
	}
	
}


