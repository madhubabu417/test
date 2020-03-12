package com.framworkeilty;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshotweb extends basiccls{
	/*
	*Description: Hrm login screenshots
	*/
public static void getscreenshots(String name) throws IOException {
	File scrlocton=new File("/HRM/Screenshots"+name+"png");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, scrlocton);
	
	System.out.println("Successfull scr's are captured");
	
}
     
}
