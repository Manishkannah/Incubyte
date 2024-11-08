package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage extends BaseClass {
	
	
	@Given("click on the create an account")
	public void CreateAccount() throws InterruptedException, IOException {
	// clicking create account button will redirect you to the create account page	
		
		Thread.sleep(2000);
		
		try {
			driver.findElement(By.xpath("(//uL[@class='header links']//a)[3]")).click();
			reportStep("create an account button clicked successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("create an account button is not clicked successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("click on the Sign in")
	public void SignIn() throws InterruptedException, IOException {
		// clicking sign in button will redirect you to the sign in page page	
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//uL[@class='header links']//a)[2]")).click();
			reportStep("Clicked on the Sign in", "pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			reportStep("Sign in button is not clicked", "fail");
			e.printStackTrace();
		}
		
	}
	
	@Then("Home page to be displayed")
	public void verifySignIn() throws IOException {
		
		try {
			String title = driver.findElement(By.xpath("(//span[contains(text(),'Welcome, Manish kannah!')])[1]")).getText();
			
			if(title.contains("Welcome")) {
				
				System.out.println("The user Signed In successfully");
				
			}
			
			else {
				
				System.out.println("The user sign in fail");
				
			}
			reportStep("Sign verified successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Sign in is not verified successfully", "fail");
			e.printStackTrace();
		}
	}


}
