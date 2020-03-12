package com.webopertion;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.framworkeilty.Screenshotweb;
import com.framworkeilty.basiccls;
import com.testcasesor.Webobjects;


public class Tc_Userlogin extends Screenshotweb {
	
	/*
	*Description:Tc_Userlogin
	*Date:11-03-2020
	*Author:Madhu
	*/

	public static void tc_01_userlogin() throws IOException{
		Webobjects wor=PageFactory.initElements(driver, Webobjects.class);
		wor.username.sendKeys("user03");
		wor.password.sendKeys("pass1234");
		wor.loginbutton.click();
		getscreenshots("After user login");
}
}