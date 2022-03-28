package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart {
	public static WebDriver driver;
	
	@FindBy(id = "input-quantity")
	@CacheLookup
	private WebElement qty;
	
	public cart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getButtonATC() {
		return buttonATC;
	}

	@FindBy(id = "button-cart")
	@CacheLookup
	private WebElement buttonATC;
}
