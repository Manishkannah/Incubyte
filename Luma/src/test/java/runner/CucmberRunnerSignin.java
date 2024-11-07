package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;




@CucumberOptions(features="src/test/java/features/Signin TS-002.feature",
				glue="pages",
				monochrome= true,
				publish= true)
public class CucmberRunnerSignin extends BaseClass {
	
	@BeforeTest
	public void setValue () throws IOException{
		TestName="Verify Sign";
		TestDescription="verifying the Sign in functionality";
		Category="smoke";
		Author="manish";
	}

}
