package com.shanku.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	
	@FindBy(xpath = "//span[text()='Portfolio']")
	public WebElement portfolio;
	
	@FindBy(xpath = "//span[@data-letters='Web Services']")
	public WebElement webservice;
	
	@FindBy(xpath = "//span[@data-letters='About']")
	public WebElement about;
	
	@FindBy(xpath = "//span[@data-letters='Blog']")
	public WebElement blog;
	
	@FindBy(xpath = "//span[@data-letters='	Events']")
	public WebElement events;
	
	@FindBy(xpath = "//span[@data-letters='Contact']")
	public WebElement contact;
	
	
}
