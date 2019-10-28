package com.nhscostcheckertool.testrunner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.nhscostcheckertool.baseclass.BaseClass;
import com.nhscostcheckertool.utils.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src\\test\\java\\com\\nhscostcheckertool\\featurefile\\Nhshelp.feature",
            glue =   {"com.nhscostcheckertool.stepdefinition"},
            plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\nhscostcheckertool\\reports\\extentreport\\report.html",
            		"pretty","json:src\\test\\resource\\com\\nhscostcheckertool\\reports\\reports.json",
                      "html:src\\test\\resource\\com\\nhscostcheckertool\\reports",
                      "junit:src\\test\\resource\\com\\nhscostcheckertool\\reports\\reports.xml"},
            strict=true,
            monochrome=true,
            dryRun=false)

	public class TestRunnerNhshelp extends BaseClass{

		public static WebDriver driver;
		
		@BeforeClass
		public static void SetupIntialization() throws Exception 
		{
			String browsername = FileReaderManager.frm.getConfigReader().getBrowsername();
			driver = launchBrowser(browsername);
		}
		@AfterClass
		public static void quit() throws IOException {
			driver.quit();
			Reporter.loadXMLConfig(
					new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\nhscostcheckertool\\properties\\extent-config.xml"));
			String report=System.getProperty("user.dir")+ "\\src\\\\test\\\\resource\\\\com\\\\nhscostcheckertool\\\\reports\\\\extentreport\\\\report.html";
			Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome "+report});

		}
		
		
}
	


	 