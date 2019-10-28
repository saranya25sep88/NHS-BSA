package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCountry {
public WebDriver driver;
	
	public SelectCountry(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='button button-get-started']")
	private WebElement startbtn;
	
	@FindBy(xpath="//label[@id='label-wales']")
	private WebElement wales;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement countrynext;

	public WebElement getStartbtn() {
		return startbtn;
	}

	public WebElement getWales() {
		return wales;
	}

	public WebElement getCountrynext() {
		return countrynext;
	}
	
	}
