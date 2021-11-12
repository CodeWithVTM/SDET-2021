package practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
@Listeners(com.vtiger.comcast.genericUtility.ListenerImplementation.class)

public class Abctest extends BaseClass{
	
	@Test
public void abc() {
	System.out.println("To check Listners working");
	//Assert.fail();
}
}
