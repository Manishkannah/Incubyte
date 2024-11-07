package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class MyAccountPage extends BaseClass {
	
	
	@Then("My Account page to be displayed")
	public void verifyMyAccountPage() throws IOException {
		try {
			String text = driver.findElement(By.xpath("//div[contains(text(),'Thank you for registering')]")).getText();
			if(text.contains("Thank you")) {
				System.out.println("User account created Successfully");
				
			}
			
			else{
				
				System.out.println("User account is not created successfully");
				
			}
			reportStep("Account creation verified successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Account creation is not verified successfully", "fail");
			e.printStackTrace();
		}
	}
	
	

}
