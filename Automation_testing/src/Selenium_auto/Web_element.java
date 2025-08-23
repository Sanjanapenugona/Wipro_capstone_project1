package Selenium_auto;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Web_element {
	public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution ) throws InterruptedException  {
	
		System.out.println("Manual test---->" +testexecution);
		WebElement user=driver.findElement(By.id("user_login"));
		user.sendKeys(user1);
		WebElement pass = driver.findElement(By.id("user_password"));
		pass.sendKeys(pass1);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welecome to zero bank page");
		loginStep(driver,"45677","password","unable to login");
		loginStep(driver,"username","23456789","unable to login");
		loginStep(driver,"","","unable to login");
		loginStep(driver,"username","password","user able to login successfully");
	}

}
