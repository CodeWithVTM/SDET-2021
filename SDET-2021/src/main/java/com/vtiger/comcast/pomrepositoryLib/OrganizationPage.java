package com.vtiger.comcast.pomrepositoryLib; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
WebDriver driver;	////Global Variable
	public OrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//------------------------------@FindBy----------------------------------------------------\\
	
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganizationButton;
	
	@FindBy(name = "search_text")
	private WebElement SearchTxtbx;
	
	@FindBy(name = "search")
	private WebElement SearchButton;
	
	
	

	//--------------Getter Method to click on create Organization -----------------------\\
	public WebElement getCreateOrganizationButton() {
		return createOrganizationButton;
	}
	
	public WebElement getSearchTxtbx() {
		return SearchTxtbx;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
