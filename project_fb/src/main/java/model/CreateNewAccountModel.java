package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAccountModel extends BaseModel {
	
	public CreateNewAccountModel(WebDriver d) {
		super(d);
	}
	public WebElement getFirstName() throws InterruptedException {
		//Thread.sleep(3000);
		By locator =By.xpath("//input[@name='firstname']");
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement e = driver.findElement(locator);
		return e;
	}
}
