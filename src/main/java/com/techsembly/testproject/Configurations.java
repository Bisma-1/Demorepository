package com.techsembly.testproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configurations {
	public static WebDriver driver;
	
	@Test
	public static void Browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testing-admin.techsembly.com");
		driver.manage().window().maximize();
		
		
		
	}

}
