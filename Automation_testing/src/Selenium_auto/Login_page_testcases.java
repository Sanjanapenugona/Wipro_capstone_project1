package Selenium_auto;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class Login_page_testcases {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welecome to zero bank page");
		{
			
		}
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("123463");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manula test ::--> check user is able to login with" + " valid username and invalid password ");
		}
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("kstm@%");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manula test ::--> check user is able to login with" + " null username and null password ");
		}
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manula test ::--> check user is able to login with" + " invalid username and invalid password ");
		}
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("sgtjama");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("1234@34");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manula test ::--> check user is able to login with" + " valid username and valid password ");
		}
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		// click on signin button
				driver.findElement(By.name("submit")).click();
				//driver.findElement(By.id("logout_link"));
				System.out.println("Login successfully");
				
				driver.close();
		
	}

}
