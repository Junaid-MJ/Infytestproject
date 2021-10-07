package com.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Demo05_AssertWelcomeMessage {
	
	WebDriver driver;
	String url="https://enjos.in/login/";
	
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","D:\\\\jar files\\\\drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws InterruptedException {
		//enter the username
		driver.findElement(By.id("user_email-16")).sendKeys("junaidmohummad@gmail.com");
		Thread.sleep(2000);
		//enter the password
		driver.findElement(By.id("user_password-16")).sendKeys("");
		Thread.sleep(2000);
		//click on the login button
		driver.findElement(By.id("um-submit-btn")).click();
		Thread.sleep(2000);
		//click on my profile 
		driver.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/div[1]/div/div[3]/ul/a[3]/li/span[2]")).click();
		Thread.sleep(2000);
		
		//fetch the text(actual message)
		String actualMessage= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/h2")).getText();
		System.out.println("Actual messaeg is :"+actualMessage);
		Thread.sleep(3000);
		//fetch the text(expected message)
		String expectedMessage="MOHAMMAD JUNAID";
		Thread.sleep(2000);
		//Assert whether the actual message coming in AUT and the expected message is same
		Assert.assertEquals(actualMessage,expectedMessage);
		String s= new String();
	
	}   
	
	@After
	public void After() {
		driver.close();
	}

}
