package Assessement_day19;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class Login_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.saucedemo.com");
		System.out.println("Welecome to page");
		{
		System.out.println("Manula test ::--> check user is able to login with" + " valid username and valid password ");
			
		}
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		System.out.println("Login successfully");

	}

}
