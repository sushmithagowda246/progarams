package Testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		//To read excel
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		FileInputStream fl=new FileInputStream("/home/tyss/Desktop/data.xlsx");
		Workbook wb=WorkbookFactory.create(fl);
		String url=wb.getSheet("ValidLoginLogout").getRow(1).getCell(2).getStringCellValue();
		driver.get(url);
		System.out.println(driver.getTitle());
		FileOutputStream fout=new FileOutputStream("/home/tyss/Desktop/data.xlsx");
		wb.write(fout);
		wb.getSheet("ValidLoginLogout").getRow(1).createCell(4).setCellValue("Homepage");
		
		}

}
