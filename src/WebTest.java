import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;
import org.junit.Assert; 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebTest {

	 @Test
	   public void site_header_is_on_home_page() {   
	       
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");     // Application\\chrome.exe");   
	      // ChromeDriver();  
			         
		 WebDriver browser = new ChromeDriver();
		 browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		 // GoTo URL		 
		 browser.get("https://loblaws.ca");  
		 browser.manage().window().maximize();
		 browser.findElement(By.linkText("MY SHOP")).click(); 
		 browser.findElement(By.linkText("SIGN IN")).click(); 
		 
		// goTo Sign up 	
		 browser.get("https://accounts.pcid.ca/create-account"); 
		 
		// Verify if message present 
		browser.getPageSource().contains("Complete your profile");
		
		// ==== Fill -out the form - REMOVED as not in the requirement ========= 
		 //WebElement popup = browser.findElement(By.cssSelector("iframe[src^='create-account.aspx']"));
		 // browser.findElement(By.name("frame_1"));		 
		 //browser.switchTo().activeElement().sendKeys("eugeneo@test.com",Keys.TAB, "Toronto!19@", Keys.ENTER ); 
		 //browser.switchTo().activeElement().sendKeys(Keys.TAB, Keys.TAB, Keys.SPACE, Keys.TAB,Keys.ENTER);
		 // ===============================================================
		
		 
		 // Close current browser
		    browser.close();
		    
		// Close all browsers 
		//browser.quit();
		 
		 
}
}
