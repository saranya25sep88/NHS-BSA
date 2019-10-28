package com.nhscostcheckertool.utils;

import org.openqa.selenium.WebDriver;

import com.nhscostcheckertool.pagelocators.BenifitsorTaxcredits;
import com.nhscostcheckertool.pagelocators.CareHome;
import com.nhscostcheckertool.pagelocators.Diabetes;
import com.nhscostcheckertool.pagelocators.Dob;
import com.nhscostcheckertool.pagelocators.Glaucoma;
import com.nhscostcheckertool.pagelocators.InjuryCaused;
import com.nhscostcheckertool.pagelocators.LiveWitPartner;
import com.nhscostcheckertool.pagelocators.NhsHelpVerifypage;
import com.nhscostcheckertool.pagelocators.PregnantorNot;
import com.nhscostcheckertool.pagelocators.Savings;
import com.nhscostcheckertool.pagelocators.SelectCountry;

public class PageobjectManager {
public WebDriver driver;
	
	public PageobjectManager(WebDriver Idriver)
	{
		this.driver=Idriver;
			}
	
	private BenifitsorTaxcredits btc;
	private CareHome ch;
    private Diabetes di;
    private Dob db;
    private Glaucoma gl;
    private InjuryCaused ic;
    private LiveWitPartner lp;
    private PregnantorNot pn;
    private Savings sa;
    private SelectCountry sc;
    private NhsHelpVerifypage helppage;
    
	public BenifitsorTaxcredits getBtc() {
		if(btc==null)
		{
			btc=new BenifitsorTaxcredits(driver);
		}
		return btc;
	}
	public NhsHelpVerifypage getHelppage() {
		if(helppage==null)
		{
			helppage=new NhsHelpVerifypage(driver);
		}
		return helppage;
	}
	public CareHome getCh() {
		if(ch==null)
		{
			ch=new CareHome(driver);
		}
		return ch;
	}
	public Diabetes getDi() {
		if(di==null)
		{
			di=new Diabetes(driver);
		}
		return di;
	}
	public Dob getDb() {
		if(db==null)
		{
			db=new Dob(driver);
		}
			return db;
	}
	public Glaucoma getGl() {
		if(gl==null)
		{
			gl=new Glaucoma(driver);
		}
		return gl;
	}
	public InjuryCaused getIc() {
		if(ic==null)
		{
			ic=new InjuryCaused(driver);
		}
		return ic;
	}
	public LiveWitPartner getLp() {
		if(lp==null)
		{
			lp=new LiveWitPartner(driver);
		}
		return lp;
	}
	
	public PregnantorNot getPn() {
		if(pn==null)
		{
			pn=new PregnantorNot(driver);
		}
		return pn;
	}
	public Savings getSa() {
		if(sa==null)
		{
			sa=new Savings(driver);
		}
		return sa;
	}
	public SelectCountry getSc() {
		if(sc==null)
		{
			sc=new SelectCountry(driver);
		}
		return sc;
	}
	
	  
    
}
