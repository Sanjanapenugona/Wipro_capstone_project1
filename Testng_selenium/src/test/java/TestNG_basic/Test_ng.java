package TestNG_basic;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Test_ng {
	 WebDriver driver;
	 private By search;
	 private By search_btn;
	 private By addToCartBtn;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://www.ebay.com/");
	        driver.manage().window().maximize();
	    }

	    @Test(priority = 1)
	    public void login() throws InterruptedException {
	        
	    	 driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")).click();
	        Thread.sleep(3000);

	        //login
	        
	    	WebElement email=driver.findElement(By.id("userid"));
	    	//email.click();
			email.sendKeys("sanjanapenugonda3@gmail.com");
			 driver.findElement(By.id("signin-continue-btn")).click();
			 Thread.sleep(2000);
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("Sanjana@123");
			driver.findElement(By.id("sgnBt")).click();
			
	
	    }


@Test(priority = 2)
public void multipleSearches() throws InterruptedException {
	driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();

    // search multiple products
    
    String[] searches = {"Watch", " TV", " Shoes"};
    for (String search : searches) {
        //driver.findElement(By.id("gh-ac")).sendKeys(search);
    	WebElement search1=driver.findElement(By.id("gh-ac"));
        search1.clear();
        search1.sendKeys(search);
        search1.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    
    }
}
@Test(priority = 3)
public void addToCartTest() throws InterruptedException {
	 WebElement searchBox = driver.findElement(By.id("gh-ac"));
	 searchBox.clear();
     searchBox.sendKeys("iPhone 14");
     driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
     Thread.sleep(3000);

     // 2. Select first product
     driver.findElement(By.xpath("//*[@id=\"item2b6e289090\"]/div/div[1]/div/a/div/img")).click();
    

     // Switch to product page tab
     for (String handle : driver.getWindowHandles()) {
         driver.switchTo().window(handle);
     }

     // 3. Click Add to Cart
     WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]/span/span"));
     addToCartBtn.click();
     Thread.sleep(3000);
 }


@Test(priority = 4)
public void deleteFromCartTest() {
	WebElement removecart = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a/span/span"));
    removecart.click();
    WebElement remove = driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
    remove.click();
}

@Test(priority = 5)
public void changeLoginName() throws InterruptedException {
	
    driver.get("https://www.ebay.com/");
	
    driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span/span")).click();
    driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a")).click();
  //  driver.findElement(By.linkText("Account settings")).click();
    driver.findElement(By.linkText("Personal Information")).click();
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    driver.findElement(By.id("userid")).clear();
    driver.findElement(By.id("userid")).sendKeys("Sanjana123");
    driver.findElement(By.xpath("//button[text()='Save']")).click();
   
    System.out.println("Login name updated");
}

@Test(priority = 7)
public void shopByCategoriesTest() {
    try {
	driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span")).click();
        driver.findElement(By.linkText("Electronics")).click();
        System.out.println("Shop by Categories Test: Executed");
    } catch (Exception e) {
        System.out.println("Shop by Categories Test Failed: " + e.getMessage());
    }
}

@Test(priority = 8)
public void productDescriptionTest() {
    driver.findElement(By.id("gh-ac")).clear();
    driver.findElement(By.id("gh-ac")).sendKeys("Smart Watch");
    driver.findElement(By.id("gh-search-btn")).click();

    WebElement productImage = driver.findElement(By.cssSelector(".s-item__image img"));
    Actions actions = new Actions(driver);
    actions.contextClick(productImage).perform();

    productImage.click();
    System.out.println("Product Description Test Executed");
}

@Test(priority = 9)
public void shopByAllCategoriesTest() {
    try {
        driver.findElement(By.id("gh-cat")).click();
        driver.findElement(By.linkText("See all categories")).click();
        System.out.println("Shop by All Categories Test: Executed");
    } catch (Exception e) {
        System.out.println("Shop by All Categories Test Failed: " + e.getMessage());
    }
}

@Test(priority = 10)
public void changeLanguageTest() throws InterruptedException {
	 WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
	 country.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Spain")).click();
	 	
      
}


}
