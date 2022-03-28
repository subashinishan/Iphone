package sd;

import org.commerce.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import helper.pommanager;
import runner.Runner;

public class lpsd extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	pommanager pom = new pommanager(driver);
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		url("https://demo.opencart.com/");
	    
	}

	@When("^User scroll down$")
	public void user_scroll_down() throws Throwable {
	  jsdown625();
	  //Thread.sleep(5000);
	}
	
	@When("^User select iphone$")
	public void user_select_iphone() throws Throwable {
		pom.getlp().getApplecamera().click();
		//Thread.sleep(5000);
	}

}

