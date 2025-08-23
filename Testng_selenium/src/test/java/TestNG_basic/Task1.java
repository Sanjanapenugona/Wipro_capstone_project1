package TestNG_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task1 {
	WebDriver driver;
	@BeforeClass
	public void beforeTest() {
	        driver = new ChromeDriver();
	        driver.get("http://zero.webappsecurity.com/login.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
  @Test
  @Parameters({"username","password"})
  public void loginTest(@Optional("admin") String Username,@Optional("admin123") String Password) throws InterruptedException {
	  System.out.println("Username:" +Username);
	  System.out.println("Password:" +Password);
	  
	  driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
  }
}
