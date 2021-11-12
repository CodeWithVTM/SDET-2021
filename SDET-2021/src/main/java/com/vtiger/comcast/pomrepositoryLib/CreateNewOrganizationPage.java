package com.vtiger.comcast.pomrepositoryLib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.comcast.genericUtility.ExcelUtility;
import com.vtiger.comcast.genericUtility.JavaUtility;

public class CreateNewOrganizationPage {
WebDriver driver;	//Global variable
	public CreateNewOrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);			/*//To Initialize Elements we are calling this driver 
														that had stored address of the current webPage*/
}
	
//----------@FindBy---\
	@FindBy(name = "accountname")
	private WebElement organizationNameTextBox;	//Org Name Textboxs
		
	
	@FindBy(xpath = "//input[@name='account_id']/following-sibling::img")
	private WebElement addOrganisationLookUpBtn;
	
	

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	

	//---------Generate getter-------------
	public WebElement getOrganizationNameTextBox() {
		return organizationNameTextBox;
	}
	
	public WebElement getAddOrganisationBtn() {
		return addOrganisationLookUpBtn;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void createOrg() throws Throwable {
		CreateNewOrganizationPage createOrg=new CreateNewOrganizationPage(driver);
		JavaUtility jlib=new JavaUtility();
		ExcelUtility elib=new ExcelUtility();
		String ORGNAME=elib.getCellValue("org", 1, 2);
		createOrg.getOrganizationNameTextBox().sendKeys(ORGNAME+" "+jlib.getRandomNumber());
		createOrg.getAddOrganisationBtn();
		createOrg.getSaveBtn().click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
