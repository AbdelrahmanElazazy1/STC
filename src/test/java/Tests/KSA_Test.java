package Tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.KSA_Page;

public class KSA_Test extends TestBase{


	KSA_Page SaudiObject;

	@Test
	public void UserCanChooseKSAPlan()

	{

		SaudiObject = new KSA_Page(driver);
		SaudiObject.UserChooseKSA();
		//String curruncy = driver.ge
		Assert.assertTrue(SaudiObject.productPricelbl.getText().contains("SAR"));
		System.out.println(SaudiObject.productPricelbl.getText());
		Assert.assertTrue(SaudiObject.productPlan.getText().contains(" Classic"));
		System.out.println(SaudiObject.productPlan.getText());

	}



}
