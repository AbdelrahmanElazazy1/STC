package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Bahrain_Page;

public class Bahrain_Test extends TestBase{

	
	Bahrain_Page BahrainObject;
	
	
	
	@Test
	public void UserCanChooseBahrainCountry()
	
	{
		BahrainObject = new Bahrain_Page(driver);
		BahrainObject.UserChooseBahrain();
		Assert.assertTrue(BahrainObject.productPricelbl.getText().contains("BHD"));
		System.out.println(BahrainObject.productPricelbl.getText());
		Assert.assertTrue(BahrainObject.productPlan.getText().contains(" Classic"));
		System.out.println(BahrainObject.productPlan.getText());
		
	}
	
	
	
	
	
}
