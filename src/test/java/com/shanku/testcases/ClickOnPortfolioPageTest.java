package com.shanku.testcases;

import org.testng.annotations.Test;

import com.shanku.base.Page;
import com.shanku.pages.actions.PortfolioPage;

public class ClickOnPortfolioPageTest {
	
	@Test
	public void clickOnPortfolioPageTest() {
		Page.initConfiguration();
		Page.topNavigation.goTOContacts();
		PortfolioPage portfolioPage=Page.topNavigation.goToPortfolio();
		portfolioPage.goToChooseCategory();
		Page.quitBrowser();
	
	}

}
