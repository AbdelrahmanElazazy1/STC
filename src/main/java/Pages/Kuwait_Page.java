package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Kuwait_Page extends PageBase{

	public Kuwait_Page(WebDriver driver) {
		super(driver);
	}


	// User change country to Kuwait 

	@FindBy(className = "country-current")
	WebElement Country;
	@FindBy(id = "kw")
	WebElement Kuwait;


	// Kuwait - Start Your Trial (Classic)
	@FindBy(id = "classic-selection")
	WebElement StartYourTrialButton;

	@FindBy(id = "cc_kuw-container")
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
	
	
	
	
	

	public void UserChooseKuwait()

	{

		Country.click();
		Kuwait.click();


		// Kuwait - Start Your Trial (Classic)
		StartYourTrialButton.click();
		ChooseVisa.click();
		NextButton1.click();
		NextButton2.click();

		// User Information
		Email.sendKeys("STC@Kuwait.com");
		Password.sendKeys("!A224Dgfdg");
		//NextButton3.click();
		//CancelButton.click();


	}



}
