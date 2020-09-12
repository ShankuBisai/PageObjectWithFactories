package com.shanku.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.shanku.base.Page;
import com.shanku.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	
	
	public HomePage() {
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}
	
	public HomePage goToOrbitMediaStudio() {
		home.orbitMediaStudiosLogo.click();
		return this;
		
	}
		
	public void goToViewAllWork() {
		home.viewAllWorkTab.click();
	}
	
	public void goToStartAProject() {
		Page.scrollToElement();
		home.startAProjectTab.click();	
	}
	
	public void goToSeeOurWork() {
			
	}
	
	public void goToSignMeUp() {
			
	}
	
	public void goToTalkToChris() {
		
		
	}
	
	
	

}
