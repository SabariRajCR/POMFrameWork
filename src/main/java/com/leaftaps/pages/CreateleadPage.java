package com.leaftaps.pages;

import org.apache.commons.collections4.functors.SwitchTransformer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateleadPage extends ProjectSpecificMethods {
	
	public CreateleadPage(){
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName") WebElement companyname;
	@FindBy(how=How.UNSET,using="createLeadForm_firstName") WebElement firstname;
	public CreateleadPage EnterCompanyName(String cn) {

		companyname.sendKeys(cn);
		return this;

	}
	public CreateleadPage EnterFirstName(String fn) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fn);
		return this;

	}
	public CreateleadPage EnterLastName(String ln) {
		driver.findElementById("createLeadForm_lastName").sendKeys(ln);
		driver.findElementByName("submitButton").click();
		return this;

	}
	public ViewLeadsPage ClickSubmitCreateLead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadsPage();

	}

}
