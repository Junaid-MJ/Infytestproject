package com.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dem04_LoginLogout {
	WebDriver driver;
	String url="https://www.packngo.in/";
	
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","D:\\\\jar files\\\\drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws InterruptedException {
//		//enter the username
		driver.findElement(By.id("email")).sendKeys("");
		Thread.sleep(2000);
//		//enter the password
		driver.findElement(By.id("pass")).sendKeys("");
		Thread.sleep(2000);
//		//click on the login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		//fetch the text
		String message= driver.findElement(By.xpath("/html/body/header/section[2]/article/aside[2]/ul/li[1]/a")).getText();
		System.out.println(message);
		Thread.sleep(3000);
		//click on logout link
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
	
	}   
	
	@After
	public void After() {
		driver.close();
	}
	
	


}
