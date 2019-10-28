package com.nhscostcheckertool.pagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PregnantorNot {
	
		public WebDriver driver;
			
			public PregnantorNot(WebDriver Idriver)
			{
				this.driver= Idriver;
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//label[@id='label-no']")
			private WebElement pregnantno;
			
			@FindBy(id="next-button")
			private WebElement pregnantpagenextbtn;
			
			public WebElement getPregnantno() 
			{
				return pregnantno;
			}

			public WebElement getPregnantpagenextbtn()
			{
				return pregnantpagenextbtn;
			}
			
			}