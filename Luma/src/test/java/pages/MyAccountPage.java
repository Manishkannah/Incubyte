package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyAccountPage extends BaseClass {
	

	
	@Then("My Account page to be displayed")
	public void verifyMyAccountPage() throws IOException {	
		
		try {
			softAssert = new SoftAssert();
			String Actual = driver.findElement(By.xpath("//div[contains(text(),'Thank you for registering')]")).getText();
			System.out.println(Actual);
			String expected = "Thank you for registering with Main Website Store.";
			softAssert.assertEquals(Actual,expected,"The user Registered successfully");
			 softAssert.assertAll();
			 reportStep("Account creation verified successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Account creation is not verified successfully", "fail");
			e.printStackTrace();
		}
	}
	
	
	@And("click on the my profile dropdown")
	public void MyProfileDD() throws IOException {
		
		try {
			driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
			reportStep("clicked on my profile successfully", "pass");
		} catch (Exception e) {
			reportStep("clicked on my profile is not successfully", "fail");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@And("click on sign out")
	public void Sigout() throws IOException {
		// clicking sign out button will redirect you to the home page	
		try {
			driver.findElement(By.xpath("(//uL[@class='header links']//a)[3]")).click();
			reportStep("clicked on sign out successfully", "pass");
		} catch (Exception e) {
			reportStep("clicked on sign out is not successfully", "fail");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
