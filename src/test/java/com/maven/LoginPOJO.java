package com.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass{
	
	public  LoginPOJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailTxt;
	
	@FindBy(name="pass")
	private WebElement passTxt;
	
	@FindBy(xpath="//button[text()=\"Log In\"]")
	private WebElement loginbtn;
	
	@FindBys({
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@id='u_0_d_my']"),
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(xpath="//button[@type='submit']"),
		
	})
	private WebElement LoginFindBys;		

	
	@FindAll({
		
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@id='u_0_d_my']"),
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(xpath="//button[@type='submit']"),
		
	})
	private WebElement LoginFindAll;


	public WebElement getEmailTxt() {
		return emailTxt;
	}


	public WebElement getPassTxt() {
		return passTxt;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getLoginFindBys() {
		return LoginFindBys;
	}


	public WebElement getLoginFindAll() {
		return LoginFindAll;
	}
}
