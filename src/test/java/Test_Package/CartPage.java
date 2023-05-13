package Test_Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[contains(text(),'FnP CL Ceramic Tea and Coffee Cup')])[1]")
	WebElement Product;
	
	@FindBy(xpath = "//input[@id ='add-to-cart-button']")
	WebElement Cart;
	
	@FindBy(id = "nav-cart")
	WebElement PageCart;
	
	@FindBy(xpath = "//span[@class = 'a-button-text a-declarative']")
	WebElement Quantity;
	
	@FindBy(id = "quantity_2")
	WebElement ChangeQuantity;
	
	public void SelectItem() {
		Product.click();
	}
	
	public void AddCart() {
		Cart.click();
	}
	
	public void GoToCart() {
		PageCart.click();
	}
	
	public void IncreaseNumber() {
		Quantity.click();
		ChangeQuantity.click();
	}
}
