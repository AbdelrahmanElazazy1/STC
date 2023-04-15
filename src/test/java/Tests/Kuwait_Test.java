package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Kuwait_Page;

public class Kuwait_Test extends TestBase{

	Kuwait_Page KuwaitObject;
	
	
	@Test
	public void UserCanChooseKuwaitPlan()
	
	{
		
		KuwaitObject = new Kuwait_Page(driver);
		KuwaitObject.UserChooseKuwait();
		Assert.assertTrue(KuwaitObject.productPricelbl.getText().contains("USD"));
		System.out.println(KuwaitObject.productPricelbl.getText());
		Assert.assertTrue(KuwaitObject.productPlan.getText().contains(" Classic"));
		System.out.println(KuwaitObject.productPlan.getText());
		
		
		
	}
	
	
	
	
	
	
}
