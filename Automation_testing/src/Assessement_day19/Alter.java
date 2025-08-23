package Assessement_day19;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Alter {

	//private static Alert alter12;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		
		WebElement alert = driver.findElement(By.id("alertButton"));
		  alert.click();
			Thread.sleep(4000);
			Alert alter111=driver.switchTo().alert();
			alter111.accept();
		
		
	      WebElement timealert = driver.findElement(By.id("timeAlertButton"));
	   timealert.click();
		Thread.sleep(4000);
		Alert alter12=driver.switchTo().alert();
		alter12.accept();
		
		Thread.sleep(4000);
		  WebElement confirmalert= driver.findElement(By.id("confirmButton"));
		   timealert.click();
			Thread.sleep(4000);
			Alert alter1=driver.switchTo().alert();
			alter1.accept();
			
			Thread.sleep(4000);
			 WebElement promtbutton= driver.findElement(By.id("promtButton"));
			   timealert.click();
				Thread.sleep(4000);
				Alert alter123=driver.switchTo().alert();
				alter123.accept();
		
//driver.get("https://demoqa.com/droppable");
//driver.manage().window().maximize();
//Actions act=new Actions(driver);
//WebElement source= driver.findElement(By.id("draggable"));
//WebElement target= driver.findElement(By.id("droppable"));
//act.dragAndDrop(source, target).perform();




	}

}
