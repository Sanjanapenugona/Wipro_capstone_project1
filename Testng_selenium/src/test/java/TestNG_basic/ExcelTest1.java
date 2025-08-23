package TestNG_basic;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExcelTest1 {
	
  @DataProvider (name= "excelData")
  public Object[][] excelDataProvider() throws IOException {
		String excelPath = "C:\\Users\\Sanjana\\Downloads\\excelData.xlsx";
		String sheetName = "sheet1";
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook workbook =WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows-1][cols];
		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);
			for(int j = 0; j<cols; j++) {
				Cell cell = row.getCell(j);
				data[i -1][j] = (cell == null) ?"" : cell.toString();
			}
		}
			workbook.close();
			fis.close();
			return data;
		}

  @Test(dataProvider="excelData")
  public void testLogin(String username1,String password1) {
//	  System.out.println("Username: "+username1+" | password: "+password1+");
	  	WebDriver driver=new ChromeDriver();
	  	driver.get("http://zero.webappsecurity.com/login.html");
	  	driver.findElement(By.id("user_login")).click();
	  	driver.findElement(By.id("user_login")).sendKeys(username1);
	  	driver.findElement(By.id("user_password")).click();
	  	driver.findElement(By.id("user_password")).sendKeys(password1);
	  	driver.findElement(By.name("submit")).click();
  }
}
