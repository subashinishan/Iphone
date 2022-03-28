package sd;

import org.commerce.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;
import helper.pommanager;
import runner.Runner;

public class iphonesd extends BaseClass{
	
	public static WebDriver driver = Runner.driver;
	
	pommanager pom = new pommanager(driver);

	@Given("^User viewing$")
	public void user_viewing() throws Throwable {
			
	}

	@When("^User click full view$")
	public void user_click_full_view() throws Throwable {
		pom.getip().getFullview().click();
		//Thread.sleep(5000);
	}

	@When("^User close full view$")
	public void user_close_full_view() throws Throwable {
		pom.getip().getFullclose().click();
		//Thread.sleep(5000);
	}

	@Then("^User first view$")
	public void user_first_view() throws Throwable {
		pom.getip().getFirstview().click();
		//Thread.sleep(5000);
	}

	@Then("^User close first view$")
	public void user_close_first_view() throws Throwable {
		pom.getip().getFirstclose().click();
		//Thread.sleep(5000);
	}

	@Then("^User second view$")
	public void user_second_view() throws Throwable {
		pom.getip().getSecondview().click();
		//Thread.sleep(5000);
	}

	@Then("^User close second view$")
	public void user_close_second_view() throws Throwable {
		pom.getip().getSecondclose().click();
		//Thread.sleep(5000);
	}

	@Then("^User third view$")
	public void user_third_view() throws Throwable {
	    pom.getip().getThirdview().click();
	    //Thread.sleep(5000);
	}
	
	@Then("^User close third view$")
	public void user_close_third_view() throws Throwable {
		pom.getip().getThirdclose().click();
		//Thread.sleep(5000);
	}

	@Then("^User fourth view$")
	public void user_fourth_view() throws Throwable {
		pom.getip().getFourthview().click();
		//Thread.sleep(5000);
	}
	
	@Then("^User close fourth view$")
	public void user_close_fourth_view() throws Throwable {
		pom.getip().getFourthclose().click();
		//Thread.sleep(5000);
	}

	@Then("^User fifth view$")
	public void user_fifth_view() throws Throwable {
		pom.getip().getFifthview().click();
		//Thread.sleep(5000);
	}
	
	@Then("^User close fifth view$")
	public void user_close_fifth_view() throws Throwable {
		pom.getip().getFifthclose().click();
		Thread.sleep(5000);
	}
	
		@Then("^User viewing review$")
	public void user_viewing_review() throws Throwable {
		pom.getip().getReview().click();
		//Thread.sleep(5000);
	}

	@Then("^User swichback to description$")
	public void user_swichback_to_description() throws Throwable {
		pom.getip().getDescription().click();
		//Thread.sleep(5000);
	}
	
	

}
