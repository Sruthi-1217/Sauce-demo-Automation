package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//*** You can run your test cases from here 


@RunWith(Cucumber.class)
@CucumberOptions(
	    

		features= {"./src/test/resources/Features/Saucelogin.feature"},
		//features= {".src/test/resources/Features"},

		glue= {"applicationHooks","stepDefination"},
       // tags="@logoutButton",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

public class TestRunner {




}
