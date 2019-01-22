package Testdata;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urban {

	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
//		FileInputStream fin=new FileInputStream("/home/tyss/Desktop/data.xlsx");
//		Workbook wb=WorkbookFactory.create(fin);
		List<WebElement> list = driver.findElements(By.xpath("//li[contains(@class,'topnav_item')]"));
		
		for(WebElement str:list)
		{
			Actions act=new Actions(driver);
			act.moveToElement(str).perform();
			//WebDriverWait wait=new WebDriverWait(driver,)
			Thread.sleep(2000);
			System.out.println(str.getText());
			String text = str.getText().toLowerCase();
			List<WebElement> list1 = driver.findElements(By.xpath("//a[contains(@href,'topnav_"+ text +"')]"));
			for(WebElement test1:list1)
			{
				if(test1.getText().length()>0)
				System.out.println(test1.getText());
			}
			//List<WebElement> lst1 = driver.findElements(By.xpath("//div[contains(@class,'subnavlist')]"));
			//for(WebElement str1:lst1)
//			{
//				System.out.println(str1.getText());
//			}
////			for(int row=0;row<=list.size();row++)
//			{
//				System.out.println(menu);
//				//System.out.println(list.size());
//				wb.getSheet("Sheet2").createRow(row).createCell(0).setCellValue(menu);
//				wb.write(new FileOutputStream("/home/tyss/Desktop/data.xlsx"));
//				
			}
		}





		



	}


