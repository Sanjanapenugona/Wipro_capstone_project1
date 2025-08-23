package TestNG_basic;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import TestNG_basic.PageClass;

public class Task2 {
	WebDriver driver;
	PageClass pg=new PageClass(driver);
	  
	 @Test(enabled = true)
	  public void shopcategory() throws InterruptedException {
		  pg=new PageClass(driver);
		  pg.shopByCategoriesTest();
	      
	  }
	  
	  //search
	  @Test(enabled = false)
	  public void search() throws InterruptedException {
	      pg=new PageClass(driver);
	      pg.search_in();
	  }
	  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
