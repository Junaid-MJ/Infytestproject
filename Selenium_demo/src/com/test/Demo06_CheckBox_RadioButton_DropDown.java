package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo06_CheckBox_RadioButton_DropDown {
	WebDriver driver;
	String url= "https://semantic-ui.com/modules/dropdown.html";
	
	@Before
	public void setup() {
		//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\drivers\\chromedriver.exe");
		
		//Open browser instance
		driver= new ChromeDriver();
		
		//open the AUT
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//Declare an implicit wait which is bounded to WebDriver instance
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
	}
	
	@Test
	public void test() throws InterruptedException {
//		//Find the From dropdown list and store it as a WebElement
//		WebElement holidayDropdown= driver.findElement(By.className("mui-btn mui-btn--primary categories"));
//		//driver.findElement(By.xpath("//*[@id=\"logo-menu\"]/div/div[2]/div[8]/button")).click();
//		
//		//Pass the reference variable for holidaydropdown as a parameter for the Select class
//		Select hdrp= new Select(holidayDropdown);
//		//Thread.sleep(2000);
//		
//		//Use the select reference variable for selecting any option using index/value/visible text approach
//		hdrp.selectByValue("Library");
//		Thread.sleep(3000);
//		WebElement one = driver.findElement(By.id("one"));
//		WebElement two = driver.findElement(By.id("two"));
//		System.out.println(one.isEnabled());
//		two.click();
//		System.out.println(one.isEnabled());
		
		
		WebElement drpdwn= driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[2]/div"));
		
		Select selectOpen= new Select(drpdwn);
		selectOpen.selectByIndex(1);
		
		
		
	
	}
	
	@After
	public void close() {
		driver.close();
	}

}
