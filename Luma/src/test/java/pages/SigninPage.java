package pages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SigninPage  extends BaseClass{
	
	
	
	@When("click on the sign in button")
	public void SignINButton() throws IOException {
		// clicking sign in button will redirect you to the home page
		
		try {
			driver.findElement(By.id("send2")).click();
			reportStep("sign in button clicked successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("sign in button is not clicked successfully", "fail");
			e.printStackTrace();
		}
		
		
		
	}
	
	@And("enter the user email")
	public void UEmail() throws IOException {
		
		try {
			// Unique mail is made as static in base page 
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uniqueEmail);
			
			reportStep("Email is entered successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Email is not entered successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@And("enter the user password")
	public void UPassword() throws IOException {
		
	try {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manish123@");
		reportStep("password is entered successfully", "pass");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("Password is not entered successfully", "fail");
		e.printStackTrace();
	}	
		
	}

}
