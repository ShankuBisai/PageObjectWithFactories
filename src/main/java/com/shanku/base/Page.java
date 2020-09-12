package com.shanku.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.shanku.pages.actions.TopNavigation;
import com.shanku.utilities.ExcelReader;
import com.shanku.utilities.ExtentManager;

public class Page {
	
	/*
	 * WebDriver
	 * ExcelReader
	 * Logs
	 * WebDriverWait
	 * ExtentReports
	 * 
	 * 
	 */

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static WebElement dropdown;
	public static String browser;
	public static TopNavigation topNavigation;
	
	
	public static void initConfiguration() {
		  
		if(Constants.browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
					+ "\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.debug("Firefox Launched");
		}
		else if(Constants.browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
					+ "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Chrome Launched");
				
		}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
		topNavigation = new TopNavigation(driver);
		driver.get(Constants.testsiteurl);
		log.debug("navigated to" + Constants.testsiteurl);
	
	}
	
	
	public static void scrollToElement() {
		
		WebElement element = driver.findElement(By.cssSelector("a.button.animate-out"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	
	
	public static void quitBrowser() {	
		driver.quit();		
	}
	
	
	
}
