package com.techsembly.testproject;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class createproduct {
	public void CreateProduct() throws InterruptedException
	{
		//Configurations.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Configurations.driver.findElement(By.linkText("Create Product")).click();
		Thread.sleep(2000);
		//WebElement element = Configurations.driver.findElement(By.className(“”));
		//JavascriptExecutor js = (JavascriptExecutor) Configurations.driver; // for scroll
		//js.executeScript(“arguments[0].scrollIntoView();“, element);
		//Thread.sleep(2000);
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
		
		//PRODUCT TYPE RADIO BUTTONS
		Thread.sleep(2000);
		//RADIO BUTTON SIMPLE
		WebElement radiosimple = Configurations.driver.findElement(By.cssSelector("input[value='simple']"));
		Actions act= new Actions(Configurations.driver);
		act.moveToElement(radiosimple).click().build().perform();
		Thread.sleep(2000);
		/*
		//RADIO BUTTON VOUCHER
		WebElement radiovoucher = Configurations.driver.findElement(By.cssSelector("input[value='voucher']"));
		Actions act1= new Actions(Configurations.driver);
		act1.moveToElement(radiovoucher).click().build().perform();
		Thread.sleep(2000);
		
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
		
		//RADIO BUTTON GIFT
		WebElement radiogift = Configurations.driver.findElement(By.cssSelector("input[value='gift']"));
		Actions act3= new Actions(Configurations.driver);
		act3.moveToElement(radiogift).click().build().perform();
		Thread.sleep(2000);
		*/
		
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
		Select dropdowntax = new Select(Configurations.driver.findElement(By.name("taxCategoryId")));
		dropdowntax.selectByValue(" "); //None
		//dropdowntax.selectByValue("59"); //Exclusive Tax
		//dropdowntax.selectByValue("58"); //Inclusive Tax
		Thread.sleep(2000);
		
		
		//VENDOR DROPDOWN
		Select dropdownvendor = new Select(Configurations.driver.findElement(By.name("vendorId")));
		dropdownvendor.selectByValue("774"); //My Client
		//dropdownvendor.selectByValue("830"); //New Vendor
		//dropdownvendor.selectByValue("1061"); //Burda Luxury
		Thread.sleep(2000);
		
		//CHECKBOX 	HIDE PRICE
		WebElement checkhideprice = Configurations.driver.findElement(By.name("hide_price"));
		Actions act6= new Actions(Configurations.driver);
		act6.moveToElement(checkhideprice).click().build().perform();
		Thread.sleep(2000);
		
		//ONSALE
		Configurations.driver.findElement(By.name("onSale")).click();
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("salePrice")).sendKeys("50");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("saleStartDate")).sendKeys("25/01/2023");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("saleEndDate")).sendKeys("26/01/2023");
		Thread.sleep(2000);
		
		//RRP
		Configurations.driver.findElement(By.name("rrp")).sendKeys("3");
		Thread.sleep(2000);
		
		//DELIVERY PRICE
		Configurations.driver.findElement(By.name("localAreaDeliveryPrice")).sendKeys("20");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("wideAreaDeliveryPrice")).sendKeys("30");
		Thread.sleep(2000);
		
		//DELIVERY DETAIL
		Configurations.driver.findElement(By.xpath("//*[@id=\"delivery-details\"]/div/div/div")).sendKeys("Automate delivery details");
		Thread.sleep(2000);
		
		//MANUFACTURE LEAD TIME
		Configurations.driver.findElement(By.name("manufacturingLeadTime")).sendKeys("2");
		Thread.sleep(2000);
		
		//SHIPPING CATEGORY DROPDOWN
		Select dropdownshipcategory = new Select(Configurations.driver.findElement(By.name("shippingCategory")));
		dropdownshipcategory.selectByValue("697"); //Mystore
		
		
		//CATEGORY SELECTION
		
		//META TITLE
		Configurations.driver.findElement(By.name("metaTitle")).sendKeys("automate metatitle");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("metaKeywords")).sendKeys("automate meta keywords");
		Thread.sleep(2000);
		Configurations.driver.findElement(By.name("metaDescription")).sendKeys("automate meta description");
		Thread.sleep(2000);
		
		//System.out.println(Configurations.driver.findElements(By.cssSelector("div[ng-reflect-klass-='check-box-cont']")).size());
		
		//VARIANTS
		Configurations.driver.findElement(By.cssSelector("checkbox[ng-reflect-value='230']")).click();
		Thread.sleep(2000);
		
		int i = 1;
		while(i<3)
		{
			Configurations.driver.findElement(By.id("add-new-variant")).click();
			Thread.sleep(2000);
			i++;
			
		}
		
		Select dropdownvariant = new Select(Configurations.driver.findElement(By.id("variant-0-0")));
		dropdownvariant.selectByValue("426"); //RED
		Configurations.driver.findElement(By.id("price0")).sendKeys("700");
		Configurations.driver.findElement(By.id("quantity0")).sendKeys("70");
		Configurations.driver.findElement(By.id("rrp0")).sendKeys("7");
		Configurations.driver.findElement(By.id("sku0")).sendKeys("red");
		Thread.sleep(4000);
		dropdownvariant.selectByValue("427"); //BLUE
		Configurations.driver.findElement(By.id("price1")).sendKeys("800");
		Configurations.driver.findElement(By.id("quantity1")).sendKeys("80");
		Configurations.driver.findElement(By.id("rrp1")).sendKeys("8");
		Configurations.driver.findElement(By.id("sku1")).sendKeys("blue");
		Thread.sleep(2000);
		
		//PROPERTIES
		
		//CUSTOM OPTIONS
		Configurations.driver.findElement(By.id("add-new-option")).click();
		Thread.sleep(2000);
		Configurations.driver.findElement(By.id("title-0")).sendKeys("Field");
		Thread.sleep(2000);
		//INPUT TYPE
		Select dropdownf1 = new Select(Configurations.driver.findElement(By.id("input-type-0")));
		dropdownf1.selectByValue("Field");
		Thread.sleep(2000);
		//IS REQUIRED
		Select dropdownIR1 = new Select(Configurations.driver.findElement(By.id("isrequired-0")));
		dropdownIR1.selectByValue("true"); //TRUE
		//dropdownIR1.selectByValue("false"); //FALSE
		Thread.sleep(2000);
		//SORT ORDER
		Configurations.driver.findElement(By.id("sort-order-0")).sendKeys("1");
		Thread.sleep(2000);
		//STORES DROPDOWN
		Configurations.driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys("Bisma Store",Keys.ENTER);
		Configurations.driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys("New Store",Keys.ENTER);
		Thread.sleep(2000);
		
		Configurations.driver.findElement(By.id("add-new-option")).click();
		Configurations.driver.findElement(By.id("add-new-option")).click();
		
		
		
		Configurations.driver.close();
		
		
		
			
	}
}
