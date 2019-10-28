package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveWitPartner {
public WebDriver driver;
	
	public LiveWitPartner(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@id='label-yes']")
	private WebElement partneryes;
	
	@FindBy(id="next-button")
	private WebElement partnerpagenextbtn;
	
		public WebElement getPartneryes() {
		return partneryes;
	}

		public WebElement getPartnerpagenextbtn() {
		return partnerpagenextbtn;
	}
	
}
