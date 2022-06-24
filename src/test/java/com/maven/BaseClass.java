package com.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 
	 public static WebDriver driver;
	 public static Actions a;
	 public static void launchUrl() {
		
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	}
	 public static void toMaximize() {
        
		 driver.manage().window().maximize();
	}
	 public static void passUrl(String url) {
          
		 driver.navigate().to(url);
	}
	 public static String getCurrentPageTittle() {
         
		 String title = driver.getTitle();
		 System.out.println(title);
		return title;
	}
	 public static void toGetCurrentUrl() {
         
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
	}
	 public static void toInput(WebElement element,String txt ) {
            
		 element.sendKeys(txt);
	}
	 public static void toPerformMouseHoverAction(WebElement element) {

		 a = actions(driver);
		 a.moveToElement(element).perform();
	}
	
	private static Actions actions(WebDriver driver2) {
	
		return null;
		
	}
	
	 public static void toPerformRightClick() {
		
	     a.contextClick().perform();
	}
	
	 public static String toGetInputValue(WebElement element) {
		
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	 public static void toClick(WebElement element) {
	 
		 element.click();
	}
	 public static void quit() {
		 
	     driver.quit();
	}
	 public static void getShotOfThePage() throws IOException {
         
		  TakesScreenshot ts= (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(source,
		    		 new File("C:\\Users\\PraveenKumar\\eclipse-Selenium\\Selenium\\Screenshot\\New.png"));
	}
	 
	 public static String excelRead(int row, int cell) throws IOException {
          
		 File f = new File("C:\\Users\\PraveenKumar\\eclipse-Selenium\\Maven_project\\ScreenShot\\file.png");
		 
		 FileInputStream fs = new FileInputStream(f);
		 
		 Workbook w = new XSSFWorkbook(fs);
		 
		 Sheet s = w.getSheet("Sheet 1");
		 
		 Row r = s.getRow(row);
		 
		 Cell c =r.getCell(cell);
		 
		 int cellType = c.getCellType();
		 
		 String value = null;
		 
		 if(cellType ==1) {
			 
			 value = c.getStringCellValue();
		 }else if (DateUtil.isCellDateFormatted(c)) {
			
			 Date d = c.getDateCellValue();
			 
			 SimpleDateFormat sim= new SimpleDateFormat("dd-MM-yyyy");
			 
			 value=sim.format(d);
		}else {
			double dd = c.getNumericCellValue();
			
			long l = (long) dd;
			
			value = String.valueOf(l);
		}
		 return value;
		 
	 }
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
