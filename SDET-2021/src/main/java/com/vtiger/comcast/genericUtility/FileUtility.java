package com.vtiger.comcast.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	/*
	 * @Author Mansoor
	 */

		public String getProperty(String key) throws Throwable {
			FileInputStream FIS=new FileInputStream("./src/test/commonProperty.properties");
			Properties p=new Properties();
			p.load(FIS);
			String value=p.getProperty(key);
			return value;
		}
		
		
	
}
