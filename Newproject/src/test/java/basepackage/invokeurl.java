package basepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class invokeurl {
	
	
public WebDriver driver;
	
	






@Test
	public void test2() throws InterruptedException
	{
	
	ExtentHtmlReporter ht=new ExtentHtmlReporter("C:\\Users\\Naveen\\git\\projectfortesting\\Newproject\\Reports\\test.html");
	ExtentReports es=new ExtentReports();
	es.attachReporter(ht);
	ExtentTest logger;
	
	logger=es.createTest("Name");
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium java workspace\\practiseproject\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		logger.log(Status.PASS, "Passed the test");
		Thread.sleep(2000);
		driver.close();
		
		es.flush();
		
		
		
	}


}
