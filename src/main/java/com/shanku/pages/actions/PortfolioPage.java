package com.shanku.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.shanku.base.Page;
import com.shanku.pages.locators.PortfolioPageLocators;

public class PortfolioPage extends Page {
	
	public PortfolioPageLocators portfolio;
	
	public PortfolioPage() {
		this.portfolio = new PortfolioPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.portfolio);
	}

	public void goToChooseCategory() {
		portfolio.chooseCategory.click();
	}
	
	public void categories() {
		
	}
	
	public void selectConsultingCategory() {
		
		
		
	}
}
