package Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchBox;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement SearchButton;
	
	public void EnterItemToSearch(String item) {
		SearchBox.sendKeys(item);
	}
	
	public void ClickSearchButton() {
		SearchButton.click();
	}

}
