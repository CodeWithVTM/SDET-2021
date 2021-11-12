package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlightBookOnClearTripSiteTest {
	@Test
	void bookTicket() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/do/search/flights");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label/../input[@name='from']")).click();
		driver.findElement(By.xpath("//label/../input[@name='from']")).sendKeys("Sing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Singapore, SG - Seletar Airport (XSP)'][1])[1]")).click();
		driver.findElement(By.xpath("//label/../input[@name='to']")).click();
		driver.findElement(By.xpath("//label/../input[@name='to']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//div[text()='Chennai, IN - Chennai Airport (MAA)'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.className("depart_date")).click();
		driver.findElement(By.xpath("(//span[text()='Next'])[2]")).click();
		driver.findElement(By.xpath("//div/a[@title='Next']/../../table/tbody/tr[4]/td[4]")).click();
		System.out.println("Flight Boooked Successfully on 20 Jan in ClearTrip");
	}

	
}
