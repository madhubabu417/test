package com.framworkeilty;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basiccls {
public static WebDriver driver;	
	/*
	*method Description:this method is create for launching the browser
	*Date:25-02-2020
	*Author:Madhu
	*/
	public static void getbrowser(String Browser) {
	if(Browser.equals("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MADHUBABU\\Downloads\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
	}
	else if(Browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MADHUBABU\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");	
	}
	else
	{

System.out.println("Browser not opened");
	}
	
}
}