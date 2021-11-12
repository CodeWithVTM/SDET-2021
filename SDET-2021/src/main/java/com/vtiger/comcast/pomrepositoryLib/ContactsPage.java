package com.vtiger.comcast.pomrepositoryLib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	WebDriver driver;	////Global Variable
	
	public ContactsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//================================================
	@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContactLink;
		
	
public WebElement getCreateContactLink() {
	return createContactLink;
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
