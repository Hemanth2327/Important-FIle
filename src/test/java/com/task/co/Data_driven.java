package com.task.co;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maven.BaseClass;
import com.maven.LoginPOJO;

public class Data_driven extends BaseClass{

	@BeforeClass
	private void beforeLaunch() {

		launchUrl();
		toMaximize();
	}

	@AfterClass
	private void afterLaunch() {
		driver.quit();
   }
	
	@BeforeMethod
	private void startTime() {
 
		passUrl("https://www.facebook.com/");
		Date d =new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endTime() {

		Date d =new Date();
		System.out.println(d);
	}
     
	
	@Test
	private void Tc1(String user, String pass) {
      
		LoginPOJO l= new LoginPOJO();
		toInput(l.getEmailTxt(), user);
		toInput(l.getPassTxt(), pass);
		toClick(l.getLoginFindAll());
	}
	
	
	

}






	

