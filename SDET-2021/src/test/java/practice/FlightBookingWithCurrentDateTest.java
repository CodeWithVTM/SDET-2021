package practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlightBookingWithCurrentDateTest {
@Test
void flightBook() throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fromCity")).click();
	driver.findElement(By.id("fromCity")).sendKeys("MAA");
	driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
	//driver.findElement(By.id("toCity")).sendKeys("BOM");
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("SIN");
	driver.findElement(By.xpath("//P[contains(text(),'Sing')]")).click();
	Date dateObj=new Date();
	String date = dateObj.toString();
	System.out.println(date);
	String[] today = date.split(" ");
	String day=today[0];
	String mon=today[1];
	String actdate=today[2];
	String year=today[5];
	
	String departureDate = day+" "+mon+" "+actdate+" "+year;
	System.out.println(departureDate);
	//driver.findElement(By.id("departure")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label='"+departureDate+"']")).click();
	System.out.println("Flight Booked  with Current Date Successfully");
	System.out.println("Flight Booked  with Current Date Successfully");
}//Tue Nov 09 2021
}
