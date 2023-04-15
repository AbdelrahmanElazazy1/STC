package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KSA_Page extends PageBase{

	public KSA_Page(WebDriver driver) {
		super(driver);

	}


	// KSA - Start Your Trial (Classic)

	@FindBy(id = "classic-selection")
	WebElement StartYourTrialButton;

	@FindBy(id = "cc_ksa-container")
	WebElement ChooseVisa;

	@FindBy (id = "btnChoosePaymentMethod")
	WebElement NextButton1;
	@FindBy(id = "btnChooseAddons")
	WebElement NextButton2;

	// User Information
	@FindBy(xpath = "//*[@id=\"readonlyEmail\"]")
	WebElement Email;
	@FindBy(id = "readonlyPassword")
	WebElement Password;
	@FindBy(xpath = "//*[@id = \"btnFinalStepSubscribe\"]")
	WebElement NextButton3;

	@FindBy(partialLinkText = "Cancel")
	WebElement CancelButton;
	
	
	@FindBy (css = "span.total-price")
	public WebElement productPricelbl;
	
	@FindBy (css = "span.total-caption")
	public WebElement productPlan;



	public void UserChooseKSA()

	{
		// KSA - Start Your Trial (Classic)
		StartYourTrialButton.click();
		ChooseVisa.click();
		NextButton1.click();
		NextButton2.click();
		
		
		// User Information
		Email.sendKeys("STC@Test12.com");
		Password.sendKeys("!A224Dgfdg");
		//NextButton3.click();
		//CancelButton.click();
		
		
		
		


	}



}
