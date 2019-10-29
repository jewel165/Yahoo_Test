package Tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Config;
import Values.YH_Values;

public class YahooHomepageTest extends Config {

	YH_Values aa = new YH_Values();

	@Test(groups = {"Smoke"})
	public void YahooURLTest() {
		String ACTurl = 	driver.getCurrentUrl();
		Assert.assertEquals(ACTurl, aa.BaseURL,"Laded in correct URL" );
		//System.out.println(abc);

	}

	@Test(groups = {"Smoke"})
	public void yahootittleTest() {
		String ACTtittle = driver.getTitle();
		System.out.println(ACTtittle);
		if(ACTtittle==aa.EXPTtittle) {
			Assert.assertTrue(true, "Tille is as expected");
		}
		else  {
			System.out.println("Yahoo tittle is not correct");
		}
	}

}
