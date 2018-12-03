package fb.com.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fb.com.LoginPagefb;
import fb.com.SendMessages;

public class LoginFbSendFile {
	WebDriver driver;
	LoginPagefb lpage;
	SendMessages spage;
	
	@BeforeClass
	public void setup() {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haree\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		lpage = new LoginPagefb(driver);
		spage = new SendMessages(driver);
	}
		
	
	@Test(priority = 1)
	public void testLogin() {
		lpage.setUsername("add your facebook email or username");
		lpage.setPassword("add your facebook password.");
		lpage.loginFb();
	}
	
	@Test(priority = 2)
	public  void postOnWall() throws InterruptedException {
		spage.clickOnProfile();
		spage.postfb();
		spage.fbpost("Hi There");
	}
	

	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
		
	}

}


