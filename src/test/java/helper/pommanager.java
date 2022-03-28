package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.cart;
import pom.iphone;
import pom.loginpage;

public class pommanager {
	
	public static WebDriver driver;
	
	private loginpage lp;
	private iphone ip;
	private cart act;
	
	public pommanager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public loginpage getlp() {
		lp = new loginpage(driver);
		return lp;
	}
	
	public iphone getip() {
		ip = new iphone(driver);
		return ip;
	}
	
	public cart getact() {
		act = new cart(driver);
		return act;
	}
}
