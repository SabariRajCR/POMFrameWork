package com.leaftaps.pages;

import org.openqa.selenium.support.ui.Select;

import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public MyHomePage ClickCRM_SFA() {

		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();

	}

	
	
	

}
