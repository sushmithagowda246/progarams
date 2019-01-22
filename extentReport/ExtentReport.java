package extentReport;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;
public class ExtentReport
{
	
	static	ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/report.html");
	static	ExtentReports exten=new ExtentReports();
	static	ExtentTest test;
	
	@Test
	public void extentPass()
	{
//		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/report.html");
//		ExtentReports exten=new ExtentReports();
		exten.attachReporter(report);
		test=exten.createTest("extentPass");
		test.log(Status.INFO,"extent report is working fine");
		test.log(Status.PASS,"test is passed");
		exten.flush();
	}
	
	@Test
	public void extentFail() throws IOException
	{
//		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/report2.html");
//		ExtentReports exten=new ExtentReports();
		exten.attachReporter(report);
		test=exten.createTest("extentFail");
		//Assert.fail();
		test.log(Status.INFO,"extent report is working fine");
		test.log(Status.FAIL,"test is failed");
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		test.addScreenCaptureFromPath("report.png");
		test.fail("Failed due to some error",MediaEntityBuilder.createScreenCaptureFromPath("./screenshot/photo.jpg")).build();*/
		
		exten.flush();
	}
	
	@Test(enabled=true)
	//@Ignore
	public void extentSkip()
	{
//		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/report3.html");
		exten.attachReporter(report);
		test=exten.createTest("extentSkip");
		test.log(Status.INFO,"extent report is working fine");
		test.log(Status.SKIP,"test is skipped");
		exten.flush();
	}
	
	@Test
	public void extentWarning()
	{
//		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/report.html");
//		ExtentReports exten=new ExtentReports();
		exten.attachReporter(report);
		test=exten.createTest("extentWarning");
		test.log(Status.INFO,"extent report is working fine");
		test.log(Status.WARNING,"test is warned");
		exten.flush();
	}
}
               