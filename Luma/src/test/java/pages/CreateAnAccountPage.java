package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateAnAccountPage extends BaseClass {
	
	
	@And("enter the first name")
	public void FirstName() throws IOException {
		try {
			driver.findElement(By.id("firstname")).sendKeys("Manish");
			reportStep("entered first name successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("first name is not entered successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@And("enter the last name")
	public void LastName() throws IOException {
		
		try {
			driver.findElement(By.id("lastname")).sendKeys("kannah");
			reportStep("last name is entered successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("last name is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter the email")
	public void Email() throws IOException {
		//int ranNum = (int)(Math.random()*9999+1000);
		try {
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mk78@gmail.com");
			reportStep("Email is entered successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Email is not entered successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@And("enter the password")
	public void Password() throws IOException {
		
	try {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manish123@");
		reportStep("password is entered successfully", "pass");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("Password is not entered successfully", "fail");
		e.printStackTrace();
	}	
		
	}
	
	@And("enter the confirm password")
	public void ConfirmPassword() throws IOException {
		try {
			driver.findElement(By.id("password-confirmation")).sendKeys("Manish123@");
			reportStep("confirm password is entered successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("confirm password is not entered successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@When("click on the create an account button")
	public void CreateButton() throws IOException {
		
		try {
			driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
			reportStep("Create button clicked successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Create button is not clicked successfully", "fail");
			e.printStackTrace();
		}
		
	}

}
