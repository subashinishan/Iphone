package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iphone {

	public static WebDriver driver;
	
	@FindBy(xpath = "(//img[contains(@title,'iPhone')])[1]")
	@CacheLookup
	private WebElement fullview;
	
	public iphone(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFullview() {
		return fullview;
	}

	public WebElement getFullclose() {
		return fullclose;
	}

	public WebElement getFirstview() {
		return firstview;
	}

	public WebElement getFirstclose() {
		return firstclose;
	}

	public WebElement getSecondview() {
		return secondview;
	}

	public WebElement getSecondclose() {
		return secondclose;
	}

	public WebElement getThirdview() {
		return thirdview;
	}

	public WebElement getThirdclose() {
		return thirdclose;
	}

	public WebElement getFourthview() {
		return fourthview;
	}

	public WebElement getFourthclose() {
		return fourthclose;
	}

	public WebElement getFifthview() {
		return fifthview;
	}

	public WebElement getFifthclose() {
		return fifthclose;
	}

	@FindBy(xpath = "(//button[contains(@class,'mfp-close')])[1]")
	@CacheLookup
	private WebElement fullclose;

	@FindBy(xpath = "(//img[contains(@alt,'iPhone')])[2]")
	@CacheLookup
	private WebElement firstview;
	
	@FindBy(xpath = "(//button[contains(@class,'mfp-close')])[1]")
	@CacheLookup
	private WebElement firstclose;
	
	@FindBy(xpath = "(//img[contains(@alt,'iPhone')])[3]")
	@CacheLookup
	private WebElement secondview;
	
	@FindBy(xpath = "//button[contains(@class,'mfp-close')]")
	@CacheLookup
	private WebElement secondclose;
	
	@FindBy(xpath = "(//img[contains(@alt,'iPhone')])[4]")
	@CacheLookup
	private WebElement thirdview;
	
	@FindBy(xpath = "(//button[contains(@class,'mfp-close')])[1]")
	@CacheLookup
	private WebElement thirdclose;
	
	@FindBy(xpath = "(//img[contains(@alt,'iPhone')])[5]")
	@CacheLookup
	private WebElement fourthview;
	
	@FindBy(xpath = "(//button[contains(@class,'mfp-close')])")
	@CacheLookup
	private WebElement fourthclose;
	
	@FindBy(xpath = "(//img[contains(@alt,'iPhone')])[6]")
	@CacheLookup
	private WebElement fifthview;
		
	@FindBy(xpath = "(//button[contains(@class,'mfp-close')])[1]")
	@CacheLookup
	private WebElement fifthclose;
	
	@FindBy(xpath = "//*[@id=\'content\']/div[1]/div[1]/ul[2]/li[2]/a")
	@CacheLookup
	private WebElement review;

	public WebElement getReview() {
		return review;
	}
	
	@FindBy(xpath = "//*[@id=\'content\']/div[1]/div[1]/ul[2]/li[1]/a")
	private WebElement description;

	public WebElement getDescription() {
		return description;
	}
}
