package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin= {"html:target/cucumber_html_report.html","pretty"},
		monochrome=true,
		features= {"src/test/java/Featurres"},
		glue= {"StepDefinations"}
		)
public class TestRunner {
	
	
}
