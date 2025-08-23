package Selenium_auto;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class Zerobank_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welecome to zero bank page");
		//{
	//		System.out.println("Manula test ::--> check user is able to login with valid credintials");
			
	//	}
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successfully");
		
		Thread.sleep(5000);
		driver.close();

	}

}
