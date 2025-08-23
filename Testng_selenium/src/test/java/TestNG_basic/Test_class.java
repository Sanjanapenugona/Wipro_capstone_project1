package TestNG_basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test_class {
	 WebDriver driver;
	 PageClass pg;
	 private By search;
	 private By search_btn;
	 private By addToCartBtn;
	 
	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        pg=new PageClass(driver);
	        driver.get("https://www.ebay.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	 
  @Test(priority=1)
  public void login() {
	  driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	  pg.email_in();
	  pg.con_in();
	  pg.pass_in();
	  pg.submit_in();
  }
  
  @Test(priority=2)
  public void search() throws InterruptedException {
	  pg.search_in();
  }
  
  
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
