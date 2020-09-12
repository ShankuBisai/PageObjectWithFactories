package com.shanku.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortfolioPageLocators {
	
	@FindBy(xpath = "//div[@class='hidden-xs']/span")
	public WebElement chooseCategory;

}
