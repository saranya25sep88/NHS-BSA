package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Diabetes {
public WebDriver driver;
	
	public Diabetes(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[@id='label-no']")
	private WebElement diabeticno;
	
	@FindBy(id="next-button")
	private WebElement diabeticpagenextbtn;
		
	
	public WebElement getDiabeticno() {
		return diabeticno;
	}

	public WebElement getDiabeticpagenextbtn() {
		return diabeticpagenextbtn;
	}
	
	}



