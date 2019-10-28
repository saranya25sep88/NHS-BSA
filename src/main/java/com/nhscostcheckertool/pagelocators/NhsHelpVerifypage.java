package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NhsHelpVerifypage {
public WebDriver driver;
	
	public NhsHelpVerifypage(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[@class='heading-medium']")
	private WebElement verifyNhshelppage;
	
	@FindBy(xpath="//p[text()=\" Because you're under 16:\"]")
	private WebElement verifyNhscostpageundersixteen;
	
	@FindBy(xpath="//p[text()=\"This means you're being taught full-time at a school, college, university or are home schooled.\"]")
	private WebElement verifyFulltimeEducationpagebwnsixteenandnineteen;
	
	@FindBy(xpath="//p[text()=\"This means you live together as a couple, you don't have to be married or in a civil partnership.\"]")
	private WebElement verifyPartnerpageabovesixty;
	
		public WebElement getverifyPartnerpageabovesixty() {
		return verifyPartnerpageabovesixty;
	}

		public WebElement getverifyNhscostpageundersixteen() {
		return verifyNhscostpageundersixteen;
	}

	public WebElement getVerifyNhshelppage() {
		return verifyNhshelppage;
	}

	public WebElement getverifyFulltimeEducationpagebwnsixteenandnineteen() {
		return verifyFulltimeEducationpagebwnsixteenandnineteen;
	}
	
}
