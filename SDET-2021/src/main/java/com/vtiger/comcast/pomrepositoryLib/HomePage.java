package com.vtiger.comcast.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;	//Global Variable
public HomePage(WebDriver driver) {
	this.driver=driver;					//TO store Current webpageAddress and to Initialize elements-[Initialization] 
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
private WebElement homeBtn;			//To Locate HomeBtn(

@FindBy(linkText = "Organizations")
private WebElement organizationsLink;

@FindBy(linkText = "Contacts")
private WebElement contactsLink;


@FindAll({@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']"),
	@FindBy(xpath = "//td[@class='small']/img[@src='themes/softed/images/user.PNG']")})	//xpath Using Forward Traversing
private WebElement administratorImg;


@FindBy(linkText = "Sign Out")
private WebElement signOutBtn;

//---------------------------------Getter Methods---------------------------\\

public WebElement getHomeBtn() {
	return homeBtn;
}
public WebElement getOrganizationsLink() {
	return organizationsLink;
}
public WebElement getContactsLink() {
	return contactsLink;
}
public WebElement getAdministratorImg() {
	return administratorImg;
}

public void logOutApplication() {	//To LogOut
	Actions action=new Actions(driver);
	action.moveToElement(getAdministratorImg()).perform();
	signOutBtn.click();
}









}
