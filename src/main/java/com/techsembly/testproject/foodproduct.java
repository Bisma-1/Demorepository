package com.techsembly.testproject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class foodproduct {
	public void FoodProduct() throws InterruptedException
	{
		Configurations.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Configurations.driver.findElement(By.linkText("Create Product")).click();
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("name")).sendKeys("automate name");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("brandName")).sendKeys("automate brand name");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("vendorSku")).sendKeys(" automate vendorSku");
		Thread.sleep(2000);
		
		//STORES DROPDOWN
		Configurations.driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys("Bisma Store",Keys.ENTER);
		Configurations.driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys("New Store",Keys.ENTER);
		Thread.sleep(2000);
		
		
		//PRODUCT TAG DROPDOWN
		Configurations.driver.findElement(By.xpath("//ng-select[@placeholder='Select Product Tag']")).click();
		Thread.sleep(2000);
		Configurations.driver.findElement(By.xpath("//div[@role='option'][2]")).click();
		Thread.sleep(2000);
		
		//LONG/SHORT DESCRIPTION
		Configurations.driver.findElement(By.xpath("//*[@id=\"short-description\"]/div/div/div")).sendKeys("Automate short description");
		Configurations.driver.findElement(By.xpath("//*[@id=\"long-description\"]/div/div/div")).sendKeys("Automate long description");
		Thread.sleep(2000);
		
		//ALLOW GIFT MESSAGE DROPDOWN
		Select dropdownallowmsg = new Select(Configurations.driver.findElement(By.name("allowGiftMessage")));
		dropdownallowmsg.selectByValue("true");    //Yes
		//dropdownallowmsg.selectByValue("false"); //No
		Thread.sleep(2000);
		
		//EMAILS
		Configurations.driver.findElement(By.name("intimation_emails")).sendKeys("automationintimate@gmail.com");
		Configurations.driver.findElement(By.name("recipient_email_link")).sendKeys("automationrecipientlink@gmail.com");
		Thread.sleep(2000);
		
		//PRODUCT TYPE RADIO BUTTONS
		
		//RADIO BUTTON FOOD
		WebElement radiofood = Configurations.driver.findElement(By.cssSelector("input[value='food']"));
		Actions act2= new Actions(Configurations.driver);
		act2.moveToElement(radiofood).click().build().perform();
		Thread.sleep(2000);
		
		Select dropdowndelivery = new Select(Configurations.driver.findElement(By.cssSelector("select[name='delivery_mode']")));
		Thread.sleep(2000);
		dropdowndelivery.selectByValue("food_both");    //FOOD BOTH
		Thread.sleep(2000);
		dropdowndelivery.selectByValue("food_pickup"); //FOOD PICKUP
		Thread.sleep(2000);
		dropdowndelivery.selectByValue("food_delivery"); //FOOD DELIVERY
		Thread.sleep(2000);
		//date calendar left
		
		
		//CHECKBOX DISABLE CART
		WebElement checkdisablecart = Configurations.driver.findElement(By.id("disable-cart"));
		Actions act4= new Actions(Configurations.driver);
		act4.moveToElement(checkdisablecart).click().build().perform();
		Thread.sleep(2000);
		
		//CHECKBOX HIDE FROM SEARCH
		WebElement checkhidesearch = Configurations.driver.findElement(By.id("hide-from-search"));
		Actions act5= new Actions(Configurations.driver);
		act5.moveToElement(checkhidesearch).click().build().perform();
		Thread.sleep(2000);
		
		//STOCK DROPDOWN
		Select dropdownstock = new Select(Configurations.driver.findElement(By.name("stockStatus")));
		//dropdownstock.selectByValue("false"); //OutofStock
		dropdownstock.selectByValue("true");    //Instock
		Thread.sleep(2000);
		
		//STOCK QUANTITY
		Configurations.driver.findElement(By.name("stockQty")).sendKeys("1000");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("minimum_order_quantity")).sendKeys("2");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("default_quantity")).sendKeys("3");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("disable_quantity")).click();
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("pack_size")).sendKeys("2");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("productPrice")).sendKeys("200");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("prefix")).sendKeys("automation prefix");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("suffix")).sendKeys("automation suffix");
		Thread.sleep(2000);
		
		//TAX DROPDOWN
		//VENDOR DROPDOWN
		
		//CHECKBOX 	HIDE PRICE
		WebElement checkhideprice = Configurations.driver.findElement(By.name("hide_price"));
		Actions act6= new Actions(Configurations.driver);
		act6.moveToElement(checkhideprice).click().build().perform();
		Thread.sleep(2000);
		
		//ONSALE
		//Configurations.driver.findElement(By.name("onSale")).click();
		
		Configurations.driver.findElement(By.name("rrp")).sendKeys("automation RRP");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("localAreaDeliveryPrice")).sendKeys("20");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("wideAreaDeliveryPrice")).sendKeys("30");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.xpath("//*[@id=\"delivery-details\"]/div/div/div")).sendKeys("Automate delivery details");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("manufacturingLeadTime")).sendKeys("2");
		Thread.sleep(2000);
		
		//SHIPPING CATEGORY DROPDOWN
		
		//CATEGORY SELECTION
		
		Configurations.driver.findElement(By.name("metaTitle")).sendKeys("automate metatitle");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("metaKeywords")).sendKeys("automate meta keywords");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("metaDescription")).sendKeys("automate meta description");
		Thread.sleep(2000);
		
	}
}
