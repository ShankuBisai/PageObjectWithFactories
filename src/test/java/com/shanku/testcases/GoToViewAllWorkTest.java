package com.shanku.testcases;

import org.testng.annotations.Test;

import com.shanku.base.Page;
import com.shanku.pages.actions.HomePage;

public class GoToViewAllWorkTest {

	@Test
	public void goToViewAWorktTest() throws InterruptedException {
		
		Page.initConfiguration();
		HomePage home = new HomePage();
		//home.goToOrbitMediaStudio().goToStartAProject();
		home.goToViewAllWork();
		Thread.sleep(3000);
		Page.quitBrowser();
			
	}
}

