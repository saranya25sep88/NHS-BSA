package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BenifitsorTaxcredits {
public WebDriver driver;
	
	public BenifitsorTaxcredits(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="label-no")
	private WebElement benifitsno;
	
	@FindBy(id="next-button")
	private WebElement benifitspagenextbtn;
	
	public WebElement getBenifitsno() {
		return benifitsno;
	}

	public WebElement getBenifitspagenextbtn() {
		return benifitspagenextbtn;
	}
}
