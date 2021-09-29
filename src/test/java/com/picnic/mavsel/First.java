package com.picnic.mavsel;


//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {	
	
		//public static void main(String args[]) throws InterruptedException
		//{
	//@Test
	public void mavsel() throws InterruptedException {
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\geetanjalip\\eclipse-workspace-Learning-Selenium\\FirstSelenium\\Drivers\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\geetanjalip\\eclipse-workspace-Learning-Selenium\\FirstSelenium\\Drivers\\geckodriver.exe");
			
			WebDriverManager.chromedriver().setup();
			//WebDriver driver = new FirefoxDriver();
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(100);
			WebElement element=driver.findElement(By.name("txtUsername"));
			element.sendKeys("Admin");
			Thread.sleep(100);
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			Thread.sleep(100);
			//pass.sendKeys("admin123");
			
		//driver.findElement(By.className("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			WebElement wel = driver.findElement(By.id("welcome"));
					wel.click();
					//driver.findElement(By.cssSelector())
			
			
			
	
			//driver.quit();

		}
	@Test
	
	public void facebooksignup(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtusername = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(txtusername)
				.click()
				.keyDown(txtusername, Keys.SHIFT)
				.sendKeys(txtusername, "hello")
				.keyUp(txtusername, Keys.SHIFT)
				.doubleClick(txtusername)
				.contextClick()
				.build();
		seriesOfActions.perform(); 
		
		
		
		
	}

	}



