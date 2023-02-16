package com.phptravels.supplierbackend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Supplier_logout extends BaseClass{
	@FindBy(xpath = "//button[@id=\"dropdownMenuProfile\"]")
	private WebElement profileBtn;
	@FindBy(xpath = "//div[contains(text(),\"Logout\")]")
	private WebElement logoutBtn;
	public  Supplier_logout(WebDriver driver)
	{
		BaseClass.driver=driver;
		PageFactory.initElements(driver,this);
		 
	}
	public void profileBtn() {
	
		profileBtn.click();	
	}
	public String logoutBtn() {

		logoutBtn.click();	
		return driver.getCurrentUrl();
	}
	
}
