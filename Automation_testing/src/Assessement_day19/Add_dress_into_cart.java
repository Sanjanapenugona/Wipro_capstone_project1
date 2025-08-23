package Assessement_day19;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
public class Add_dress_into_cart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Welecome to page");
		 WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/div/input"));
		 searchBox.clear();
	     searchBox.sendKeys("dress");
	     searchBox.sendKeys(Keys.ENTER);
	     Thread.sleep(3000);

	     // 2. Select first product
	     driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img")).click();
	    

	     // Switch to product page tab
	     for (String handle : driver.getWindowHandles()) {
	         driver.switchTo().window(handle);
	     }

	     // 3. Click Add to Cart
	     WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
	     addToCartBtn.click();
	 

	     // Wait for cart page to load
	     Thread.sleep(3000);
	

        driver.quit();

	}

}
