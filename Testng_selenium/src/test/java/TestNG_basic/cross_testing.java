package TestNG_basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class cross_testing {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
//		driver = new ChromeDriver();
		Thread.sleep(3000);
//      driver.manage().window().maximize();
       }

  @AfterTest
  public void chromebrowser() throws InterruptedException {
	  {
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/"); 
		  String expectedurl="https://www.amazon.in/";
		  String actualurl=driver.getCurrentUrl();
		  Assert.assertEquals(actualurl, expectedurl,"Url validation fail");
		  Thread.sleep(3000);
		  System.out.println("Amazon - Thread: " + Thread.currentThread().getId());
	      driver.quit();
	  }
  }
  public void firefoxbrowser() throws InterruptedException {
	  {
		  driver = new FirefoxDriver();
		  driver.get("https://www.amazon.in/"); 
		  String expectedurl="https://www.amazon.in/";
		  String actualurl=driver.getCurrentUrl();
		  Assert.assertEquals(actualurl, expectedurl,"Url validation fail");
		  Thread.sleep(3000);
		  System.out.println("Amazon - Thread: " + Thread.currentThread().getId());
	      driver.quit();
	  }
  }
  public void edgebrowser() throws InterruptedException {
	  {
		  System.setProperty("webdriver.edge.driver","\"C:\\Users\\Sanjana\\OneDrive\\Desktop\\Selenium files\\edgedriver_win64.zip\"");
		  driver = new EdgeDriver();
		  driver.get("https://www.amazon.in/"); 
		  String expectedurl="https://www.amazon.in/";
		  String actualurl=driver.getCurrentUrl();
		  Assert.assertEquals(actualurl, expectedurl,"Url validation fail");
		  Thread.sleep(3000);
		  System.out.println("Amazon - Thread: " + Thread.currentThread().getId());
	      driver.quit();
	  }
  }
  

}
