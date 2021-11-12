package com.vtiger.comcast.genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;
/**
 *  This class contains java specific generic libraries 
 * @author Mansoor
 *
 */
public class JavaUtility {
	
	
	/**
	 * This method is used to get Random Numbers between 0 to 10000
	 * @return intData
	 */
	public int getRandomNumber(){
		Random random=new Random();
		int randomNum=random.nextInt(10000);
		return randomNum;
}
	public String getSystemDateAndTime(){
		Date date=new Date();
		String systemDateAndTime=date.toString();
		return systemDateAndTime;
	}
	/**
	 * This Method is used to Pass Virtual Key to OS
	 * @throws AWTException
	 */
	public void pressVirtualKey() throws AWTException {
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
	}
		/**
		 * This Method is Used to Press S through VirtualKeys
		 */
		 public void pressVirtualKey_S() throws Throwable {
		    	
		    	Robot rc=new Robot();
		    	rc.keyPress(KeyEvent.VK_S);

	}	 
			/**
			 * This Method is Used to Press Alt_key through VirtualKeys
			 */
			 public void pressVirtualKeyAlt() throws Throwable {
			    	
			    	Robot rc=new Robot();
			    	rc.keyPress(KeyEvent.VK_ALT);
		}
	 
	
}
	

