package runner;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;


@CucumberOptions(features="src/test/java/features/CreateAccount TS-001.feature",
				glue="pages",
				monochrome= true,
				publish = true)
public class CucumberRunnerCreateAccount extends BaseClass {


	public void CucumberRunnerTS001() {
		
		
		
	}
}
