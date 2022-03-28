package runner;

import org.commerce.baseclass.BaseClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feature",
				 glue = "sd",
				 monochrome = true,
				 dryRun = true,
				 plugin = "pretty")

public class Runner {
	
	public static WebDriver driver;

	@Before
	public static void setup() throws Throwable {
		driver = BaseClass.browserLaunch("chrome");
			
	}
	
	@After
	public static void close() {
		driver.quit();
	}
}
	
	

