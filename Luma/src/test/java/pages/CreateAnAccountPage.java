package pages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateAnAccountPage extends BaseClass {
	//public static int ranNum;
	//public static String uniqueEmail;
	
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
		//ranNum = (int)(Math.random()*9999+1000);
		try {
			uniqueEmail = "manish"+ new Random().nextInt(100000)+"@gamil.com";
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uniqueEmail);
			
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
	// After clicking on the create button you will be redirected to My account page	
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
