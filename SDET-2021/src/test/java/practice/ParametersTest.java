package practice;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

public class ParametersTest {
@Test
public void parameterTest(){
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	System.out.println(BROWSER+"bro url"+URL);
//	System.out.println();
}
}
