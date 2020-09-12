package com.shanku.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.shanku.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver) {
	
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
	}
	
	
	
	public PortfolioPage goToPortfolio() {
		topNavigation.portfolio.click();
		return new PortfolioPage();
		
	}

	public WebServices goToWebServices() {
		topNavigation.webservice.click();
		return new WebServices();
			
	}
	
	public void goToAbout() {
		topNavigation.about.click();
		
	}
	
	public void goToBlog() {
		topNavigation.blog.click();
			
	}
	
	public void goToEvents() {
		topNavigation.events.click();
			
	}
	
	public void goTOContacts() {
		topNavigation.contact.click();
		
	}


}
