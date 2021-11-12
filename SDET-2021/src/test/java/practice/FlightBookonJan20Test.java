package practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlightBookonJan20Test {
@Test
void bookTicket() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
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
	
	String Todays_Date = day+" "+mon+" "+actdate+" "+year;
	System.out.println(Todays_Date);
	//driver.findElement(By.id("departure")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	driver.findElement(By.xpath("//div[@aria-label='Thu Jan 20 2022']")).click();
	System.out.println("Flight Booked Successfully on Thu Jan 20 2022");
	
}
}
