package com.picnic.mavsel;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IndividualSauce {
	@Test

		public  void mysauce () throws InterruptedException {									
			System.setProperty("webdriver.chrome.driver","C:\\Users\\geetanjalip\\eclipse-workspace-Learning-Selenium\\FirstSelenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
	        
	     
	                    		
	        driver.get("https://www.saucedemo.com/");
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");	
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        Thread.sleep(3000);
	       // driver.findElement(By.id("react-burger-cross-btn")).click();
	        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("SWAG LABS");
			
			
			assertTrue(verifyTitle);
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	        driver.findElement(By.id("shopping_cart_container")).click();
	        driver.findElement(By.id("checkout")).click();
	        driver.findElement(By.id("first-name")).sendKeys("Geetanjali");
	        driver.findElement(By.id("last-name")).sendKeys("P");
	        driver.findElement(By.id("postal-code")).sendKeys("54321");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("finish")).click();
	        driver.findElement(By.id("back-to-products")).click();
	        driver.findElement(By.id("react-burger-menu-btn")).click();
	        driver.findElement(By.id("logout_sidebar_link")).click();
	        
	        
	        
	        
	        
	        
	        

}
}
