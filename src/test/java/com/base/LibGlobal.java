package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {

	public static WebDriver driver;

	public WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver 1.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public void loadUrl(String url) {

		driver.get(url);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterText(WebElement e, String data) {
		e.clear();
		e.sendKeys(data);
		System.out.println(data + " is entered in the textbox " + e);
	}

	public void btnClick(WebElement e) {
		e.click();
		System.out.println(e + " button is clicked");
	}

	public void maxBrowser() {
		driver.manage().window().maximize();
	}

	public void quitBrower() {
		driver.quit();

	}

	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	public void drp_Down_ByValue(WebElement e, String val) {
		Select s = new Select(e);
		s.selectByValue(val);
	}

	public void drp_Down_ByIndex(WebElement e, int val) {
		Select s = new Select(e);
		s.selectByIndex(val);
	}

	public void drp_Down_ByVisibleTxt(WebElement e, String val) {
		Select s = new Select(e);
		s.selectByVisibleText(val);
	}

	public void get_Title() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public void clickLink(WebElement e) {
		e.click();
	}
	
	public void RbtnClick(WebElement e) {
		e.click();
		System.out.println(e + " Radio button is clicked");
	}
	
	
	
	

}
