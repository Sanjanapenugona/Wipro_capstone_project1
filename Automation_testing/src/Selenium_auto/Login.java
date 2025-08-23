package Selenium_auto;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("Welecome to login page");
		{
		System.out.println("Manula test ::--> check user is able to login with" + " valid username and invalid password ");
			
		}
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
	
		System.out.println("Login unsuccessfully");
		Thread.sleep(5000);
		{
			System.out.println("Manula test ::--> check user is able to login with" + " invalid username and invalid password ");
		}
		
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("kstm@%");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manula test ::--> check user is able to login with" + " null username and null password ");
		}
		
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manula test ::--> check user is able to login with" + " invalid username and invalid password ");
		}
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("afgghnh");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manula test ::--> check user is able to login with" + " valid username and valid password ");
		}
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.name("submit")).click();
         Thread.sleep(5000);
		//driver.findElement(By.id("logout_link"));
		System.out.println("Login successfully");
		
		driver.close();


	}

}
