package Assessement_day19;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
public class Logout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		System.out.println("Welecome to page");
		
		  // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
           System.out.println("login successfully");
        // Click menu
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000); // Wait for menu to open

        // Click logout
        driver.findElement(By.id("logout_sidebar_link")).click();
        System.out.println("logout successfully");
       

        driver.quit();

	       

	}

}
