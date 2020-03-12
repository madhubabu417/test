package com.testcasesor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Webobjects {
	/*
	*Object Description: Login page objects
	*/

	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	@FindBy(id="txtPassword")public WebElement password;
	@FindBy(id="btnLogin")public WebElement loginbutton;
	

}
