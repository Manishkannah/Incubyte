package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class SigninPage  extends BaseClass{
	
	@When("click on the sign in button")
	public void SignINButton() throws IOException {
		
		try {
			driver.findElement(By.id("send2")).click();
			reportStep("sign in button clicked successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("sign in button is not clicked successfully", "fail");
			e.printStackTrace();
		}
		
	}

}
