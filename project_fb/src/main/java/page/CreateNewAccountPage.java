package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel {

	public CreateNewAccountPage(WebDriver d) {
		super(d);
		
	}
	public void typeFirstName(String firstname) throws InterruptedException {
		WebElement e = getFirstName();
		e.clear();
		e.sendKeys(firstname);
	}

}
