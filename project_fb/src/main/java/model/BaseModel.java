package model;

import org.openqa.selenium.WebDriver;

public class BaseModel {
      
	public WebDriver driver;
	
	public BaseModel(WebDriver d) {
		driver= d;
	}
}
