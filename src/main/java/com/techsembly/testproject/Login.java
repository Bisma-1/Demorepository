package com.techsembly.testproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test
	public void LoginMethod() throws InterruptedException
	
	
	{
		Configurations.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Configurations.driver.findElement(By.id("email")).sendKeys("bisma.khan9088@gmail.com");
		Configurations.driver.findElement(By.id("password")).sendKeys("bisma.khan9088@gmail.com");
		Configurations.driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
	}

}
