package com.pack.contest;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ConTest {

static Logger logger = Logger.getLogger(ConTest.class.getName());
	
	WebDriver driver;
	 @Test
	 public void ExampleForAlert() throws InterruptedException{
		 

			 
		 System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://localhost:8800/conference/Conference.html");
		

		 driver.findElement(By.id("txtFirstName")).sendKeys("Devanshu");
		 driver.findElement(By.id("txtLastName")).sendKeys("Gupta");
		 driver.findElement(By.id("txtEmail")).sendKeys("devanshu@gmail.com");
		 driver.findElement(By.id("txtPhone")).sendKeys("9000989131");
		 Select s = new Select(driver.findElement(By.name("size")));
		 s.selectByIndex(0);
		 driver.findElement(By.id("txtAddress1")).sendKeys("qwertyyuuiyhgbngbgb");
		 driver.findElement(By.id("txtAddress2")).sendKeys("abcd");
		 Select s1 = new Select(driver.findElement(By.name("city")));
		 s1.selectByVisibleText("Pune");
		 Select s2 = new Select(driver.findElement(By.name("state")));
		 s2.selectByIndex(2);
		 driver.findElement(By.name("memberStatus")).click();
		 driver.findElement(By.partialLinkText("Next")).click();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 
		//driver.get("http://localhost:8800/conference/PaymentDetails.html");
		 driver.findElement(By.id("txtCardholderName")).sendKeys("Devanshu");
		 driver.findElement(By.id("txtDebit")).sendKeys("748596102030");
		 driver.findElement(By.id("txtCvv")).sendKeys("123");
		 driver.findElement(By.id("txtMonth")).sendKeys("02");
		 driver.findElement(By.id("txtYear")).sendKeys("2012");
	
		
		 driver.findElement(By.id("btnPayment")).click();
		 Alert alert1 = driver.switchTo().alert();
		 alert1.accept();
		 
		 Assert.assertEquals("Payment Details",driver.getTitle());
		 driver.close();
		 //driver.findElement(By.className("nav-input")).click();
		 //Alert alert = driver.switchTo().alert();
		 //logger.info(alert.getText());
		 //alert.accept();
		/* int i=0;
		 while(!sauce.getOptions().isEmpty())
		 {
		 logger.info(sauce.getAllSelectedOptions().get(i).getText());
		 sauce.deselectByIndex(i);
		 i++;
		 }
		 }*/
		
	 }
		 
	 

}


