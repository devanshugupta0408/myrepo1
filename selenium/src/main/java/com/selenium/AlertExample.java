package com.selenium;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertExample  {

	static Logger logger = Logger.getLogger(AlertExample.class.getName());
	
	WebDriver driver;
	 @Test
	 public void ExampleForAlert() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8084/Selenium/Alert.html");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		 Alert alert = driver.switchTo().alert();
		 logger.info(alert.getText());
		 alert.accept();
		 logger.info("Done");
		 
	 }
	
}
