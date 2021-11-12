package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.FileUtility;

public class HandlingDynamicWebTableTest {
	WebDriver driver;
	@Test
public void handlingDynamicWebTable() throws Throwable {
	FileUtility flib=new FileUtility();
	String URL=flib.getProperty("url");
	String USERNAME=flib.getProperty("Username");
	String PASSWORD=flib.getProperty("Password");
	String BROWSER=flib.getProperty("Browser");
	//1.Launch the Browser
	if (BROWSER.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
	}
	else if (BROWSER.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
	}
	else {
		System.err.println("INVALID BROWSER NAME");
	}
	//2.Go to URL and Login in
	driver.get(URL);
	driver.manage().window().maximize();
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	//3.Navigate to Organizations page
	driver.findElement(By.linkText("Organizations")).click();
	//ListOut all the Elements
	List<WebElement> List = driver.findElements(By.xpath("//table[@class='lvtBg']/tbody/tr[*]/td/div/table/tbody/tr[*]/td[1]"));
	Thread.sleep(3000);
	for(int i = 0; i < List.size()-1; i++) {
		
		List.get(i).click();
	break;
	}
	
	//Select s=new Select(List);
	//s.deselectAll();
	
	/*Select the Last one	 */
	List.get(List.size()-1).click();
	/*Select only  5 and 6 */
	driver.findElement(By.xpath("//table[@class='lvtBg']/tbody/tr[*]/td/div/table/tbody/tr[7]/td[1]")).click();
	driver.findElement(By.xpath("//table[@class='lvtBg']/tbody/tr[*]/td/div/table/tbody/tr[8]/td[1]")).click();
	/* Delete only select Organization	 */
	driver.findElement(By.xpath("//table[@class='lvtBg']/tbody/tr[*]/td/div/table/tbody/tr[9]/td[1]")).click();
	driver.findElement(By.xpath("//table[@class='lvtBg']/tbody/tr[*]/td[*]/div/table/tbody/tr[9]/td[8]/a[text()='del']")).click();
			
}
}
