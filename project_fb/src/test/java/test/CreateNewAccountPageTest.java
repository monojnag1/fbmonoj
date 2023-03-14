package test;

import org.testng.annotations.Test;

public class CreateNewAccountPageTest extends BaseTest {
	
	@Test
	public  void createaccountpagetest() throws InterruptedException {
	
		
		getHomePage();
		homepage.clickOnCreateNewAccountBtn();
		
		getCreateNewAccountPage();
		createnewpage.typeFirstName("joe");
		
	}
}
