package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bahrain_Page extends PageBase{

	public Bahrain_Page(WebDriver driver) {
		super(driver);
	}

	// User change country to Bahrain 
	@FindBy(className = "country-current")
	WebElement Country;
	@FindBy(id = "bh")
	WebElement Bahrain;

	
	// Bahrain - Start Your Trial (Classic)
	@FindBy(id = "classic-selection")
	WebElement StartYourTrialButton;

	@FindBy(id = "cc_brn-container")
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
	
	
	


	public void UserChooseBahrain()

	{

		Country.click();
		Bahrain.click();


		// Bahrain - Start Your Trial (Classic)
		StartYourTrialButton.click();
		ChooseVisa.click();
		NextButton1.click();
		NextButton2.click();

		// User Information
		Email.sendKeys("STC@Bahrain.com");
		Password.sendKeys("123456789");
		//NextButton3.click();
		//CancelButton.click();


	}


}
