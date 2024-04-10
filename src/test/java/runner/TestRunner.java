package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/quality_way.html"}, //reporting purpose
//				plugin= {
//						"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				        },
				monochrome=false,  //console output color
				tags = "@tag", //tags from feature file

//						tags = "@home", //tags from feature file
				features = {"src/test/resources/features"}, //location of feature files - folder name
				glue= "step_definition") //location of step definition files - package name


		public class TestRunner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {	
				return super.scenarios();
		    }
	}