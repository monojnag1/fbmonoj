package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreateNewAccountPage;
import page.HomePage;

public class BaseTest {
	
	static WebDriver driver;
	static HomePage homepage;
	static CreateNewAccountPage createnewpage;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/monojnag/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
			
	}
    public void getHomePage() {
    	homepage=new HomePage(driver);
    	
    }
    public void getCreateNewAccountPage() {
		createnewpage = new CreateNewAccountPage(driver);
		
	}
		
}
