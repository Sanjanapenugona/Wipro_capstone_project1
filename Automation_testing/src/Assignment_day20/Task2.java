package Assignment_day20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
    Thread.sleep(3000);

    // select single color 
    WebElement select = driver.findElement(By.id("oldSelectMenu"));
    Select s = new Select(select);
    s.selectByVisibleText("Blue");
    s.selectByIndex(0);
    
    //select multiple colors
    WebElement multiSelect = driver.findElement(By.id("react-select-4-input"));
    
    multiSelect.sendKeys("Green");
    multiSelect.sendKeys(Keys.ENTER);
    System.out.println("Successfully clicked Green color");

    multiSelect.sendKeys("Red");
    multiSelect.sendKeys(Keys.ENTER);
    System.out.println("Successfully clicked Red color");

    multiSelect.sendKeys("Black");
    multiSelect.sendKeys(Keys.ENTER);
    System.out.println("Successfully clicked Black color");

    Thread.sleep(6000);
    driver.quit();
}
}
