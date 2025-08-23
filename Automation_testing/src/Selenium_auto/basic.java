package Selenium_auto;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
public class basic {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my first automation script");
		//setup browser(chrome driver, firefox driver)
	    //System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\Sanjana\\OneDrive\\Desktop\\Selenium files\\geckodriver.exe\"");
		//create object for browser
		WebDriver driver=new FirefoxDriver();
		//set webapplication URL
	//	try
	//	{
		driver.get(" https://www.selenium.dev");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		System.out.println("page load successfully");
	//	}
	//	catch(Exception e)
	//	{
		//	System.out.println("Unable to open URL");
			//System.out.println(e);
	//	}
	

	}

}
