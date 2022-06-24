package com.task.co;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.maven.BaseClass;

public class Iphone_Count extends BaseClass{

	@BeforeClass
	private void browserLaunch() {
		launchUrl();
		toMaximize();
	}
	
	@Test
	private void iphone() {
	    driver.get("http://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> Count = driver.findElements(By.tagName("img"));
		System.out.println("The Total Count Of Iphone is:" +Count.size());
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    price.size();
	      for (int i = 0; i < price.size(); i++) {
			
	    	  System.out.println("Price is " +price.get(i).getText());
		}
	}
	
    @AfterClass
    private void closeBrowser() {
    	driver.quit();
	}
}	
    