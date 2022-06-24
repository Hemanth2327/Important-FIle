package com.testNG.co;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static WebDriver dr;
	
	@Parameters({"browser"})
	@Test
	private void Tc1(String browsername) {

		if (browsername.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			 dr =new ChromeDriver();
			
	}else if (browsername.contains("Edge")) {
		
		WebDriverManager.chromedriver().setup();
		
		 dr =new ChromeDriver();
	}
		dr.get("http://www.facebook.com/");
		
	}
   
}
