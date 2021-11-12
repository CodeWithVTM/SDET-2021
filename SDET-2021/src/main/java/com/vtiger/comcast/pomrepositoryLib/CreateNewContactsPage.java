package com.vtiger.comcast.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
	WebDriver driver;	////Global Variable
	public CreateNewContactsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//---------------------------------------
	
	@FindBy(name = "lastname")
	private WebElement LastNameTxtBx;
	
	@FindBy(xpath = "//input[@name='account_id']/following-sibling::img")
	private WebElement addOrganisationLookUpBtn;


	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	
	
	
	public WebElement getLastNameTxtBx() {
		return LastNameTxtBx;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getAddOrganisationLookUpBtn() {
		return addOrganisationLookUpBtn;
	}
}
