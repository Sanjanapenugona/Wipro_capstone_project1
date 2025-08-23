package Selenium_auto;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
public class Practice_form {

	private static final WebElement Year = null;
	private static final WebElement Month = null;
	private static final String FileUtils = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
	//	driver.manage().window().maximize();
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,400)");
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("sanjana");
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("dhana");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("sanjana@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		 WebElement mobile = driver.findElement(By.id("userNumber"));
	        mobile.sendKeys("9876543210");
	        
	        //date of birth
	        
	//      driver.findElement(By.id("dateOfBirthInput")).click();
	 //     driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).click();
	 //     Select sel=new Select(Year);
    //       sel.selectByVisibleText("2024");
	        
	//       driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();
   //     Select sel1=new Select(Month);
   //     sel.selectByVisibleText("April");
    //    driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]")).click();
	       
	       //subject
	//       WebElement sub = driver.findElement(By.id("subjectsInput"));
	//       sub.sendKeys("Maths");
	//      sub.sendKeys(Keys.ENTER);
	//      sub.sendKeys("Phy");
	//      sub.sendKeys(Keys.ENTER);
	//      sub.sendKeys("co");
	//      sub.sendKeys(Keys.ARROW_DOWN);
	//      sub.sendKeys(Keys.ENTER);
	        // hobbies
	      driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	     driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	      
	      //subject
	      String[] subjects= {"Math", "Phy", "Eco", "Eng"};
	       WebElement sub = driver.findElement(By.id("subjectsInput"));
      for (String subject:subjects)
       {
	   sub.sendKeys(subject);
	  sub.sendKeys(Keys.ENTER);
       }
     // js.executeScript("window.scrollBy(0,900)");
      //upload picture
      WebElement img = driver.findElement(By.id("uploadPicture"));
      img.sendKeys("C:\\Users\\Sanjana\\OneDrive\\Desktop\\wipro");
      //state and city
      WebElement state = driver.findElement(By.id("react-select-3-input"));
      sub.sendKeys("NCR");
	  sub.sendKeys(Keys.ENTER);
	  
	  WebElement city = driver.findElement(By.id("react-select-4-input"));
      sub.sendKeys("Delhi");
	  sub.sendKeys(Keys.ENTER);
	  //submit
	  WebElement submit = driver.findElement(By.id("submit"));
	 
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest=new File("screenshot.png");
	   Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
	   
      

	}

}
