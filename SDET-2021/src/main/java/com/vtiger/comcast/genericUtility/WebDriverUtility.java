package com.vtiger.comcast.genericUtility;
/**
 * 
 * @author ROMEO
 *
 */

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * To wait Until PageLoad-ImplicitlyWait
	 * @param driver
	 * @param int
	 */
	public void waitUntilPageLoad(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	/**
	 * This Method waits,For Element to be Visible
	 * @param driver
	 * @param element
	 */
	public void waitUntilElementIsPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	 * This Method Waits for the Element to be clicked,	This method is used to Avoid elementInterAcceptable
	 Exception
	 * Custom wait
	 * @param element
	 * @throws InterruptedException 
	 */
	public void waitAndClick(WebElement element) throws InterruptedException {
		int count=0;
		while (count<20) {
			try {
				element.click();
				break;
			}
			catch (Exception e) {
				Thread.sleep(1000);
				count++;
			}
		}
	}
	
	/**
	 * This Method is Used to Handle Drop Down List Using VisibleText
	 * @param element
	 */
	public void select(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	/**
	 * This Method is Used to Handle Drop Down List Using SelectByIndex
	 * @param element
	 * @param index
	 */
	public void select(WebElement element,int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	/**
	 *  This Method is Used to Handle Drop Down List Using SelectByValue
	 *  @param value
	 *  @param element
	 */
	public void select(String value,WebElement element) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	/**
	 * This Method is used for Automating Mouse Actions
	 * we use Actions class
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * This Method is Used to Right Click On the Element
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * This Method is used to switch From One window to Other 
	 * @param driver
	 * @param partialWinTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWinTitle)
	   {
		   Set<String> window = driver.getWindowHandles();
		   Iterator<String> it = window.iterator();
		   while (it.hasNext())
		   {
			   String winId=it.next();
			   String title=driver.switchTo().window(winId).getTitle();
	           if(title.contains(partialWinTitle))
	           {
	        	   break;
	           }
			   
		   }
		   
	   }

	 
			 
			 
			 
			 
			 
			 
}
