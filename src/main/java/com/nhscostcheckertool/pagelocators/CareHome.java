package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareHome {
public WebDriver driver;
	
	public CareHome(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="label-no")
	private WebElement carehomeno;
	
	@FindBy(id="next-button")
	private WebElement carehomepagenextbtn;
	
	

	public WebElement getCarehomeno() {
		return carehomeno;
	}

	
	public WebElement getCarehomepagenextbtn() {
		return carehomepagenextbtn;
	}
	
}


