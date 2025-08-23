package Selenium_auto;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class URL_validation {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my first automation script");
		//setup browser(chrome driver, firefox driver)
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjana\\OneDrive\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
		//create object for browser
		WebDriver driver=new ChromeDriver();
		//set webapplication URL
	
		driver.get("https://www.selenium.dev");
		String expectedurl=("https://www.selenium.dev");
		String actualurl=driver.getCurrentUrl();
		System.out.println("Expected URL:"+expectedurl);
		System.out.println("Actual URL:"+actualurl);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(expectedurl.equals(actualurl))
		{
			System.out.println("URL validation successfully");
		}
		else
		{
			System.out.println("URL validation failed");
		}
		driver.close();
		System.out.println("page load successfully");
	//	}
	
	

	}

}
