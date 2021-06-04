package Stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        
    plugin = {"pretty", "html:target/cucumber-html","json:target/cucumber-json"},
    features = "src/test/java/features",
    tags = {"@Sanity,@Smoke"},
    glue = { "Stepdef" }
    )
	
	public class TestRunner{
		
	}




