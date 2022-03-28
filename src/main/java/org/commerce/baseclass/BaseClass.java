package org.commerce.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\driver96\\chromedriver.exe"));
				driver = new ChromeDriver();		
			} else {
				System.out.println("InvalidBrowser");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void url(String value) {
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.close();
	}
	
	public static void goTo() {
		driver.navigate().to("address");
	}

	public static void goBack() {
		driver.navigate().back();
	}
	
	public static void goFor() {
		driver.navigate().forward();
	}
	
	public static void load() {
		driver.navigate().refresh();
	}
	
	public static void get(String value) {
		driver.get(value);
	}
	
	public static void caution() {
		driver.switchTo().alert().accept();
	}
	
	public static void perform(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static void iframe(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void rob(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}
	
	public static void dropDown(WebElement element, String options, String value) {
		Select s = new Select(element);
		
		try {
			if (options.equalsIgnoreCase("byIndex")) {
				int parsInt = Integer.parseInt(value);
				s.deselectByIndex(parsInt);
			}
			else if (options.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} 
			else if (options.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			} 
			else {
				System.out.println("Invalid");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} 
	}
	
	public static void checkBox(WebElement element) {
		element.click();
	}
	
	public static void isEnable(WebElement element) {
		element.isEnabled();
	}
	
	public static void isDisabled(WebElement element) {
		element.isDisplayed();
	}
	
	public static void isSelect(WebElement element) {
		element.isSelected();
	}
	
	public static void getOptions(WebElement element) {
		Select s1 = new Select(element);
		s1.getOptions();
	}
	
	public static void Title(String title) {
		driver.getTitle();
		System.out.println(title);
	}
	
	public static void current(String url) {
		driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void text(WebElement element) {
		element.getText();
	}
	
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void erase(WebElement element) {
		element.clear();
	}
	
	public static void jsdown450() {
		JavascriptExecutor jsd450 = (JavascriptExecutor) driver;
		jsd450.executeScript("window.scrollBy(0,450)", "");

	}
	
	public static void jsup450() {
		JavascriptExecutor jsu450 = (JavascriptExecutor) driver;
		jsu450.executeScript("window.scrollBy(0,-450)", "");

	}
	
	public static void jsdown625() {
		JavascriptExecutor jsd625 = (JavascriptExecutor) driver;
		jsd625.executeScript("window.scrollBy(0,625)", "");

	}
	
	public static void jsup625() {
		JavascriptExecutor jsu625 = (JavascriptExecutor) driver;
		jsu625.executeScript("window.scrollBy(0,-625)", "");

	}
	
	public static void takeScreenShot(String capture) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srce = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\suba\\eclipse-workspace\\Base_Class\\ScreenShot\\img.png");
		FileUtils.copyDirectory(srce, dest);
	}
	
	}
