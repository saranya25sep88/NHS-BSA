package com.nhscostcheckertool.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.nhscostcheckertool.baseclass.BaseClass;
import com.nhscostcheckertool.testrunner.TestRunnerNhshelp;
import com.nhscostcheckertool.utils.FileReaderManager;
import com.nhscostcheckertool.utils.PageobjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NhshelpStepdefinition extends BaseClass {
	
	public static WebDriver driver = TestRunnerNhshelp.driver;	 
	public static PageobjectManager bsa = new PageobjectManager(driver);

@Given("^User launch the NHS Costs Checker tool application$")
public void user_launch_the_NHS_Costs_Checker_tool_application() throws Throwable {
	String url = FileReaderManager.frm.getConfigReader().getUrl();
	getUrl(url);
}

@Given("^user has selected start Button$")
@When("^user select start$")
public void user_select_start() throws Throwable {
     clickonElement(bsa.getSc().getStartbtn());    
}

@When("^user choose country as \"([^\"]*)\" and click next button in page$")
public void user_choose_country_as_and_click_next_button_in_page(String arg1) throws Throwable {
	clickonElement(bsa.getSc().getWales());
	clickonElement(bsa.getSc().getCountrynext());
}

@When("^the user enters the date of birth above nineteen below sixty click on Next Button$")
public void the_user_enters_the_date_of_birth_above_nineteen_below_sixty_click_on_Next_Button() throws Throwable {
	sendvaluestoElement(bsa.getDb().getDate(), "31");
    sendvaluestoElement(bsa.getDb().getMonth(), "12");
	sendvaluestoElement(bsa.getDb().getYear(), bsa.getDb().yearCalcUnderSixty());
	clickonElement(bsa.getDb().getDobnext()); 
    }
@When("^user selects living with partner as yes and click next button$")
public void user_selects_living_with_partner_as_yes_and_click_next_button() throws Throwable {
	clickonElement(bsa.getLp().getPartneryes());
	clickonElement(bsa.getLp().getPartnerpagenextbtn());
}

@When("^user selects for claim any benifits or credits as no and click next button in page$")
public void user_selects_for_claim_any_benifits_or_credits_as_no_and_click_next_button_in_page() throws Throwable {
     clickonElement(bsa.getBtc().getBenifitsno());
     clickonElement(bsa.getBtc().getBenifitspagenextbtn());   
}

@When("^user selects for pregnant or have you given birth in the last (\\d+) months as no and click next button in page$")
public void user_selects_for_pregnant_or_have_you_given_birth_in_the_last_months_as_no_and_click_next_button_in_page(int arg1) throws Throwable {
     clickonElement(bsa.getPn().getPregnantno());
     clickonElement(bsa.getPn().getPregnantpagenextbtn());
}

@When("^user selects for an injury or illness caused by serving in the armed forces as no and click next button in page$")
public void user_selects_for_an_injury_or_illness_caused_by_serving_in_the_armed_forces_as_no_and_click_next_button_in_page() throws Throwable {
     clickonElement(bsa.getIc().getInjuryno());
     clickonElement(bsa.getIc().getInjurypagenextbtn());     
}

@When("^user selects for diabetes as no and click next button in page$")
public void user_selects_for_diabetes_as_no_and_click_next_button_in_page() throws Throwable {
     clickonElement(bsa.getDi().getDiabeticno());
     clickonElement(bsa.getDi().getDiabeticpagenextbtn());     
}

@When("^user selects for glaucoma as no and click next button in page$")
public void user_selects_for_glaucoma_as_no_and_click_next_button_in_page() throws Throwable {
     clickonElement(bsa.getGl().getGlaucomano());
     clickonElement(bsa.getGl().getGlaucomanopagenextbtn());
}

@When("^user selects for partner live permanently in a care home as no and click next button in page$")
public void user_selects_for_partner_live_permanently_in_a_care_home_as_no_and_click_next_button_in_page() throws Throwable {
     clickonElement(bsa.getCh().getCarehomeno());
     clickonElement(bsa.getCh().getCarehomepagenextbtn());     
}

@When("^user selects for you and your partner have more than £(\\d+),(\\d+) in savings, investments or property as no and click next button in page$")
public void user_selects_for_you_and_your_partner_have_more_than_£_in_savings_investments_or_property_as_yes_and_click_next_button_in_page(int arg1, int arg2) throws Throwable {
     clickonElement(bsa.getSa().getSavingsno());
     clickonElement(bsa.getSa().getSavingspagenextbtn());     
}

@Then("^user should get a result of get help with NHS costs page$")
public void user_should_get_a_result_of_get_help_with_NHS_costs_page() throws Throwable {
         String verifynhshelppage = bsa.getHelppage().getVerifyNhshelppage().getText();
         Assert.assertEquals("You get free:", verifynhshelppage);
}   

@Given("^user has selected country as \"([^\"]*)\" and click on next button$")
public void user_has_selected_country_as_and_click_on_next_button(String arg1) throws Throwable {
	clickonElement(bsa.getSc().getWales());
	clickonElement(bsa.getSc().getCountrynext());     
}

@When("^the user enters the date of birth under sixteen and click on Next Button$")
public void the_user_enters_the_date_of_birth_under_sixteen_and_click_on_Next_Button() throws Throwable {
	sendvaluestoElement(bsa.getDb().getDate(), "31");
    sendvaluestoElement(bsa.getDb().getMonth(), "12");
	sendvaluestoElement(bsa.getDb().getYear(), bsa.getDb().yearCalcUnderSixteen());
	clickonElement(bsa.getDb().getDobnext());     
}

@Then("^user should get a under sixteen result of get help with NHS costs page$")
public void user_should_get_a_under_sixteen_result_of_get_help_with_NHS_costs_page() throws Throwable {
	 String verifyundersixteenpage = bsa.getHelppage().getverifyNhscostpageundersixteen().getText();
     Assert.assertEquals("Because you're under 16:", verifyundersixteenpage);
    }

@When("^the user enters the date of birth between sixteen and nineteen and click on Next Button$")
public void the_user_enters_the_date_of_birth_between_sixteen_and_nineteen_and_click_on_Next_Button() throws Throwable {
	sendvaluestoElement(bsa.getDb().getDate(), "31");
    sendvaluestoElement(bsa.getDb().getMonth(), "12");
	sendvaluestoElement(bsa.getDb().getYear(), bsa.getDb().yearCalcUnderNineteen());
	clickonElement(bsa.getDb().getDobnext());     
	Thread.sleep(1000);
}     
@Then("^user should get full-time education page$")
public void user_should_get_full_time_education_page() throws Throwable {
	   String verifyfulltimepage = bsa.getHelppage().getverifyFulltimeEducationpagebwnsixteenandnineteen().getText();
	   Assert.assertTrue(verifyfulltimepage.contains("taught full-time at a school, college, university or are home schooled."));
	   Thread.sleep(1000);
}

@When("^the user enters the date of birth above sixty and click on Next Button$")
public void the_user_enters_the_date_of_birth_above_sixty_and_click_on_Next_Button() throws Throwable {
	sendvaluestoElement(bsa.getDb().getDate(), "30");
    sendvaluestoElement(bsa.getDb().getMonth(), "09");
	sendvaluestoElement(bsa.getDb().getYear(), bsa.getDb().yearCalcabovesixty());
	clickonElement(bsa.getDb().getDobnext()); 
	Thread.sleep(1000);
     }

@Then("^user should get Partner page question$")
public void user_should_get_Partner_page_question() throws Throwable {
	String verifypartnerpage = bsa.getHelppage().getverifyPartnerpageabovesixty().getText();
	 Assert.assertTrue(verifypartnerpage.contains("you don't have to be married or in a civil partnership."));
		
}
}
