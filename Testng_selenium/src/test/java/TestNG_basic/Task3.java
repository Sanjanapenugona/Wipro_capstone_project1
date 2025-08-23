package TestNG_basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import TestNG_basic.PageClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task3 {
	public class multipletime {
		WebDriver driver;
		PageClass pg=new PageClass(driver);
		
		  @Test
		  public void search() throws InterruptedException {
		    	for (int i = 1; i <= 5; i++) {
		    	pg=new PageClass(driver);
		    	pg.search_in();
		    	}
			  
		  }

  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
	}

}
