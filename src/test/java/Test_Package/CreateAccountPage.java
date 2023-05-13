package Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "sc-buy-box-ptc-button")
	WebElement BuyNow;
	
	public void BuyProduct() {
		BuyNow.click();
	}
	
}
