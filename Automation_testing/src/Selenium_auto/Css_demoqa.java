package Selenium_auto;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
public class Css_demoqa {

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver=new ChromeDriver();
		//	driver.get("https://www.youtube.com/results?search_query=cartoon");
			driver.get("https://demoqa.com/automation-practice-form");
			Thread.sleep(5000);
			 driver.findElement(By.cssSelector("input[id=\"firstName\"]")).sendKeys("sanjana");
			//sendKeys("sanjana");
		//	driver.manage().window().maximize();
			//Date of birth 
			  driver.findElement(By.id("dateOfBirthInput")).click();
		  driver.findElement(By.cssSelector("select>option[value=\"2024\"]")).click();
			  driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
			  driver.findElement(By.cssSelector("div[aria-label=\"Choose Monday, April 1st, 2024\"]")).click();
			
			//link test
			//  driver.findElement(By.linkText("\"The Wheel on the Ambulance 🚑  Cartoon Cars | Baby Shark Sing a Song | Nursery Rhymes & Kids Songs 13 minutes, 17 seconds\"")).click();
	       
	}

		private static void sendKeys(String string) {
			// TODO Auto-generated method stub
			
		}

}
