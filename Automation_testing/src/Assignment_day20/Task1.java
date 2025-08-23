package Assignment_day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
	
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://demoqa.com/buttons");

			Actions act = new Actions(driver);

			WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
			act.doubleClick(DoubleClick).perform();
			System.out.println("sucessfully clicked double click button");
			Thread.sleep(2000);

			WebElement RightClick = driver.findElement(By.id("rightClickBtn"));
			act.contextClick(RightClick).perform();
			System.out.println("sucessfully clicked right click button");
			Thread.sleep(2000);

			WebElement SingleClick = driver.findElement(By.id("DmErm"));
			SingleClick.click();
			System.out.println("sucessfully clicked single click button");
			Thread.sleep(2000);

			driver.get("https://demoqa.com/droppable");
			driver.manage().window().maximize();
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			act.dragAndDrop(source, target).perform();
			Thread.sleep(2000);

			driver.close();
	        
	}

}
