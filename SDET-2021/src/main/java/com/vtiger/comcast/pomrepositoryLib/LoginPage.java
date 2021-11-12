package com.vtiger.comcast.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {	//1.Create a Separate Java Class for Every Page in Application
	  
	public LoginPage(WebDriver driver) {	//3.create a Constructor to Initialize the Elements Using PageFactory.initElements-Initialization
		PageFactory.initElements(driver, this);
	}
	/**
	 * Rule 2.	Identify all the Elements Using @FindBy , @FindBys and @FindAll [Declaration]
	 */
	@FindBy(name="user_name")	//given name is a locator
	private WebElement UserNameEdt;	//for this UserNameEdt webElement above name tag is locator
	
	@FindBy(xpath = "//input[@type='password']")	//Using Xpath Locator of below reference webelement
	private WebElement PassWordEdt;
	
	@FindAll({@FindBy(id="submitButton"),@FindBy(xpath = "//input[@type='submit']")})
	private WebElement LoginBtn;

	/*
	 * Declare ALL the Elements as Private & provide getters Method,business Method -[Utilization]
	 * To create Getter methods -->R.click on Anywhere inside the program class-->Go To SOURCE -->Generate getters method and select 
	 */
	public WebElement getUserNameEdt() {
		return UserNameEdt;
	}

	public WebElement getPassWordEdt() {
		return PassWordEdt;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	/*
	 * To reduce CodeLength Create a Login method and CALL-codeOptimization
	 */
	public void loginToApp(String UserName,String PassWord) {//Business Logic
		/* Step 1.login	*/
		getUserNameEdt().sendKeys(UserName);
		getPassWordEdt().sendKeys(PassWord);
		getLoginBtn().click();
		
	}
	
	
	
	
	
	
	
	
	
}
