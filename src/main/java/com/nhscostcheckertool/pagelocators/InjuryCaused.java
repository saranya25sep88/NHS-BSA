package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InjuryCaused {
	public WebDriver driver;
	
	public InjuryCaused(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="label-no")
	private WebElement injuryno;
	
	@FindBy(id="next-button")
	private WebElement injurypagenextbtn;
	
	public WebElement getInjuryno() {
		return injuryno;
	}

	public WebElement getInjurypagenextbtn() {
		return injurypagenextbtn;
	}
	
	}

