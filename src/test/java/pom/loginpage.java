package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//img[contains(@class,'img-responsive')])[6]")
	@CacheLookup
	private WebElement applecamera;

	public loginpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

		public WebElement getApplecamera() {
		return applecamera;
	}
	
	
}
