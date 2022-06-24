package com.task.co;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.maven.BaseClass;

public class Snapdeal extends BaseClass {

	@BeforeClass
	private void browserLaunch() {
		launchUrl();
		toMaximize();
	}

	@Test
	private void Tc1() {
		
		passUrl("https://www.snapdeal.com/");
		WebElement fashion = driver.findElement(By.xpath("//span[@class='catText']"));
		WebElement shoes = driver.findElement(By.xpath("//a[@data-index=\"1.1.2\"]/child::span[text()='Sports Shoes']"));
		Actions a = new Actions(driver);
		a.moveToElement(fashion);
		a.click(shoes).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[text()='ASIAN Running Shoes']")).click();
		String win1 = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		List<String> lt = new ArrayList<String>();
		lt.addAll(allwin);
		driver.switchTo().frame(1);
		WebElement Sprice = driver.findElement(By.xpath("//span[@itemprop='price']"));
		String rstxt = Sprice.getText();
		Assert.assertEquals("449", rstxt);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		driver.switchTo().window(win1);
	}
	
	@AfterClass
	private void closeBrowser() {
		driver.quit();
	}
}
