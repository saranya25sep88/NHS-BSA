package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Savings {
public WebDriver driver;
	
	public Savings(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="label-no")
	private WebElement savingsno;
	
	@FindBy(id="next-button")
	private WebElement savingspagenextbtn;
	
	public WebElement getSavingsno() {
		return savingsno;
	}

	public WebElement getSavingspagenextbtn() {
		return savingspagenextbtn;
	}

}


