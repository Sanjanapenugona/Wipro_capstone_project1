package Assignment_day20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		
		WebElement timebutton = driver.findElement(By.id("timerAlertButton"));
		timebutton.click();
		Thread.sleep(5000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		
		Thread.sleep(2000);
		WebElement confirmbox = driver.findElement(By.id("confirmButton"));
		confirmbox.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();

		
		Thread.sleep(2000);
		WebElement promptbox = driver.findElement(By.id("promtButton")); // correct id.
		promptbox.click();
		Thread.sleep(2000);
		Alert alert4 = driver.switchTo().alert();

		alert4.sendKeys("Sanjana penugonda");
		alert4.accept();

		driver.close();

	}

}
