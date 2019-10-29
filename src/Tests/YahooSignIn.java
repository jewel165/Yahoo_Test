package Tests;

import org.testng.annotations.Test;

import Base.Config;
import Locators.YH_Locators;
import Util.WebDriverMethods;
import Values.YH_Values;

public class YahooSignIn extends Config {
	
	WebDriverMethods aa = new WebDriverMethods();
	YH_Locators bb = new YH_Locators();
	YH_Values cc = new YH_Values();
	
	
	@Test
	public void YahooSignInTest() {
		ClickByXpath(bb.SignInbtn);
		TypeById(bb.userId,cc.Email02);
		ClickByXpath(bb.Login_Continue);
		TypeById(bb.Login_Password,cc.passWord);
		ClickByXpath(bb.Login);
		
	}

}
