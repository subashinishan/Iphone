package sd;

import org.commerce.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;
import helper.pommanager;
import runner.Runner;

public class cartsd extends BaseClass {
	
public static WebDriver driver = Runner.driver;
	
	pommanager pom = new pommanager(driver);
	
	@Given("^User adding$")
	public void user_adding() throws Throwable {
	    
	}

	@When("^User added qty$")
	public void user_added_qty() throws Throwable {
	    pom.getact().getQty().sendKeys("2");
	    Thread.sleep(5000);
	}

	@When("^User scrolldown$")
	public void user_scrolldown() throws Throwable {
		jsdown450();
		Thread.sleep(5000);
	   
	}

	@Then("^User click ATC$")
	public void user_click_ATC() throws Throwable {
		pom.getact().getButtonATC().click();
		Thread.sleep(5000);
	  
	}

}
