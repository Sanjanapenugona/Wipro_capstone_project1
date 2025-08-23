package TestNG_basic;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	 WebDriver driver;
	 PageClass pg;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://www.ebay.com/");
	        driver.manage().window().maximize();
	    }

	    @Test(priority = 1)
	    public void login() throws InterruptedException {
	        // Pre-requisite: Valid login credentials
	    	 driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")).click();
	        Thread.sleep(3000);

	        //login
	        
	    	WebElement email=driver.findElement(By.id("userid"));
	    	email.click();
			email.sendKeys("sanjanapenugonda3@gmail.com");
			 driver.findElement(By.id("signin-continue-btn")).click();
			 Thread.sleep(2000);
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("Sanjana@123");
			driver.findElement(By.id("sgnBt")).click();
			
			
			
	    }

	    @Test(priority = 3)
	    public void addToCartTest() {
	        driver.findElement(By.id("gh-ac")).clear();
	        driver.findElement(By.id("gh-ac")).sendKeys("Wireless Mouse");
	        driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
	        driver.findElement(By.xpath("//*[@id=\"item2b662f8d18\"]/div/div[1]/div/a/div/img")).click();
	        driver.get("https://www.ebay.com/itm");
	       // driver.findElement(By.cssSelector(".s-item__link")).click();
	        driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]/span/span")).click();
	   //     Assert.assertTrue(driver.getPageSource().contains("added to your cart"));
	    
	        
	    }

}
