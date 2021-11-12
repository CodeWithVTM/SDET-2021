package com.vtiger.comcast.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.comcast.pomrepositoryLib.HomePage;
import com.vtiger.comcast.pomrepositoryLib.LoginPage;
/**
 * This Class Contains Basic Configurations all the Test Script should extends from this class
 * @author Mansoor
 *
 */
public class BaseClass {
	/*Object Creation*/
	public  WebDriver driver;
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public JavaUtility jlib=new JavaUtility();
	public WebDriverUtility wlib=new WebDriverUtility();
	


	@BeforeSuite
	public void configBS() {
		System.out.println("connecting To Db");
	}
	@BeforeClass
	public void configBc() throws Throwable {
			System.out.println("Launch the Browser");
			String BROWSER=flib.getProperty("Browser");
			if(BROWSER.equals("firefox")){
				driver=new FirefoxDriver();//Example for Polymorphism
			}
			else if (BROWSER.equals("chrome")) {
				driver=new ChromeDriver();
			}
		wlib.waitUntilPageLoad(driver, 15); //
		driver.manage().window().maximize();
	}
		
	@BeforeMethod
	public void configBm() throws Throwable {
		System.out.println("Login to Application");
		/*Create CommonData*/
		String URL=flib.getProperty("url");
		String USERNAME=flib.getProperty("Username");
		String PASSWORD=flib.getProperty("Password");
		
		driver.get(URL);
		LoginPage login=new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
	}

	
	//---------------------------------------------
	
	@AfterMethod
	public void configAm() {
		System.out.println("LogOut of Application");
		HomePage hp=new HomePage(driver);	
		hp.logOutApplication();

	}
	
	@AfterClass
	public void configAc() {
		System.out.println("Close the Browser");
		driver.close();
	}
	@AfterSuite
	public void configAs() {
		System.out.println("Closing the connection of DB");
	}



















}
