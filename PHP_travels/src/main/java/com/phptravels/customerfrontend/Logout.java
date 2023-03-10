package com.phptravels.customerfrontend;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.phptravels.baseclass.BaseClass;

public class Logout extends BaseClass {
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' Logout'] ")
	private WebElement logout;
	@FindBy (xpath = "//span[text()='Login']")
	private WebElement login;
	
	public Logout(WebDriver driver)
	{
		 BaseClass.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	
	public String clickLogout() {
      	
	   	logout.click();
	   	return driver.getCurrentUrl();
	    }

}
