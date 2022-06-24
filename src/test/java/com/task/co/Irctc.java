package com.task.co;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maven.BaseClass;

public class Irctc extends BaseClass{
	
	@BeforeClass
	private void openBrowser() {
		launchUrl();
		toMaximize();
	}

	@Test
	private void Tc1() {

		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WebElement from = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		toInput(from, "CHENNAI EGMORE - MS");
		WebElement to = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		toInput(to, "RAMESWARAM - RMM");
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> trainno = driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));

		for (WebElement ttr : trainno) {
			System.out.println("The Train name and no. is: " +ttr.getText());
		}
	}
	
	@AfterClass
	private void closeBrowser() {
		driver.quit();
	}

}
