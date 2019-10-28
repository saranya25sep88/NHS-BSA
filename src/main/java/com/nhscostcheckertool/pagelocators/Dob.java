package com.nhscostcheckertool.pagelocators;

import java.time.Year;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dob {
public WebDriver driver;
	
	public Dob(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="dob-day")
	private WebElement date;
	
	@FindBy(id="dob-month")
	private WebElement month;
	
	@FindBy(id="dob-year")
	private WebElement year;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement dobnext;
	
	public WebElement getDate() {
		return date;
	}
	
	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getDobnext() {
		return dobnext;
	}
	
	public static String yearCalcUnderSixteen()
	{
		int year = Year.now().getValue();
		int CalculatedYear = year - 16;
		String valueOf = String.valueOf(CalculatedYear);
		return valueOf; 
	}
	
	public static String yearCalcUnderNineteen() {
		int year = Year.now().getValue();
		int CalculatedYear = year - 19;
		String valueOf = String.valueOf(CalculatedYear);
		return valueOf; 
	}
	
	public static String yearCalcUnderSixty() {
	int year = Year.now().getValue();
	int CalculatedYear = year - 59;
	String valueOf = String.valueOf(CalculatedYear);
	return valueOf; 
	}
	
	public static String yearCalcabovesixty() {
		int year = Year.now().getValue();
		int CalculatedYear = year - 60;
		String valueOf = String.valueOf(CalculatedYear);
		return valueOf; 
	}
}