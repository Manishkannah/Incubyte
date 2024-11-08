package runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;


@CucumberOptions(features="src/test/java/features/CreateAccountAndSignIn TS-001.feature",
				glue="pages",
				monochrome= true,
				publish = true)
public class CucumberRunnerCreateAccountAndSignIn extends BaseClass {

	@BeforeTest
	public void CucumberRunnerTS001() {
		
		TestName="Verify Sign";
		TestDescription="verifying the Sign in functionality";
		Category="smoke";
		Author="manish";
		
	}
}
