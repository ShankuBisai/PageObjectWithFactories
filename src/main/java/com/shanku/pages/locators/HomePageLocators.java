package com.shanku.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	
	@FindBy(xpath = "//a[text()='View All Work ›']")
	public WebElement viewAllWorkTab;
	
	@FindBy(css = "a.button.animate-out")
	public WebElement startAProjectTab;
	
	@FindBy(xpath = "//img[@alt='Orbit Media Studios']")
	public WebElement orbitMediaStudiosLogo;

}
