package practice;

import org.testng.annotations.Test;

public class parametersTest {
@Test
public void parameterTest(String URL,String BROWSER){
	System.out.println(URL);
	System.out.println(BROWSER);
}
}
