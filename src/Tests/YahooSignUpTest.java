package Tests;

import org.testng.annotations.Test;

import Base.Config;
import Locators.YH_Locators;
import Util.WebDriverMethods;
import Values.YH_Values;

public class YahooSignUpTest extends Config {
	
	WebDriverMethods aa = new WebDriverMethods();
	YH_Locators bb = new YH_Locators();
	YH_Values cc = new YH_Values();
	
	@Test(groups = {"Smoke"})
	public void YahooSignUp() {
		ClickByXpath(bb.SignInbtn);
		//ClickByXpath(bb.CRTaccount);
		ClickById(bb.CRTaccount);
		TypeByXpath(bb.SN_Fname,cc.Fname);
		TypeByXpath(bb.SN_Lname,cc.Lname);
		TypeByXpath(bb.SN_Eail,cc.Email);
		TypeByXpath(bb.SN_Password,cc.passWord);
		SelectCountryCode(cc.countrycode);
		TypeByXpath(bb.SN_Mobile,cc.mobile);
		SelectMonth(cc.Month);
		TypeByXpath(bb.SN_Day,cc.day);
		TypeByXpath(bb.SN_Year,cc.Year);
		ClickByXpath(bb.SN_Continue);
		
		
	}
	

}
