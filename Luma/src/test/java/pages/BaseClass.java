package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.gherkin.model.IGherkinFormatterModel;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver ;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String TestName,TestDescription,Author,Category;
	public static String uniqueEmail;
	
	
	@BeforeSuite
	public void StartReport() {
		
		ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/result.html");
		report.setAppendExisting(true);
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		
	}
	
	@BeforeClass
	public void TestCaseDetails() {
	
		
		test = extent.createTest(TestName,TestDescription);
		test.assignAuthor(Author);
		test.assignCategory(Category);
		
	}
	
	
	public int createShot() throws IOException {
		int ranNum = (int)(Math.random()*9999999+1000000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File ("./Snaps/img"+ranNum+".png");
		FileUtils.copyFile(source, destination);
		return ranNum;
	}

	public void reportStep(String msg, String status) throws IOException {
		
		if(status.equalsIgnoreCase("pass")) {
			
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img"+createShot()+".png").build());
		}
		else if (status.equalsIgnoreCase("fail")) {
			
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img"+createShot()+".png").build());
		}
	}
	
	@BeforeMethod
	public void preCondition() {
		
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	@AfterMethod
	public void postCondition() {
		//driver.quit();
	}
	
	@AfterSuite
	public void stopReport() {
		
		extent.flush();
		
	}

}
