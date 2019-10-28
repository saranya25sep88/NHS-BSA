package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Glaucoma {
public WebDriver driver;
	
	public Glaucoma(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@id='label-no']")
	private WebElement glaucomano;
	
	@FindBy(id="next-button")
	private WebElement glaucomanopagenextbtn;
	
	public WebElement getGlaucomano() {
		return glaucomano;
	}

	public WebElement getGlaucomanopagenextbtn() {
		return glaucomanopagenextbtn;
	}
	
	}
