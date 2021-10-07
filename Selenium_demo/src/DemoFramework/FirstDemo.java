package DemoFramework;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\jar files\\drivers\\chromedriver.exe");
		//creating webdriver instance
		WebDriver driver;
		driver=new ChromeDriver();
		
		// navigate to webpage
		driver.get("https://www.packngo.in/");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		
		
		//retrieving the webpage title
		String title= driver.getTitle();
		System.out.println("the title of the page is : "+ title);
		
		driver.findElement(By.linkText("About Us")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//close browser
		driver.close();
		driver.quit();
		
	}
	

}
