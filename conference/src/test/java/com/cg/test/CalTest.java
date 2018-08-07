package com.cg.test;



import java.util.logging.Logger;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CalTest {

static Logger logger = Logger.getLogger(CalTest.class.getName());
	
	WebDriver driver;
	 @Test
	 public void ExampleForAlert() throws InterruptedException{
		 
		 try {
			 
		 System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://localhost:8800/Conference.html");
		 //driver.get("https://www.amazon.in");
		 Thread.sleep(2000);
		 Select sauce = new Select(driver.findElement(By.id("sel")));
		sauce.selectByVisibleText("Onion");
		 sauce.selectByIndex(2);
		 
	//	driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		 //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		 //driver.findElement(By.className("nav-input")).click();
		 //Alert alert = driver.switchTo().alert();
		 //logger.info(alert.getText());
		 //alert.accept();
		 int i=0;
		 while(!sauce.getOptions().isEmpty())
		 {
		 logger.info(sauce.getAllSelectedOptions().get(i).getText());
		 sauce.deselectByIndex(i);
		 i++;
		 }
		 }
		 finally {
			 driver.close();
		 }
		
	 }
	 
	 
}
