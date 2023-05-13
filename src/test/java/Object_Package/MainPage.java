package Object_Package;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base_Package.Base_Class;
import Test_Package.CartPage;
import Test_Package.CreateAccountPage;
import Test_Package.SearchPage;
import Utility_Package.DataFromExcel;
import Utility_Package.ExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage extends Base_Class{
	SearchPage search;
	CartPage add;
	CreateAccountPage account;
	DataFromExcel excel = new DataFromExcel();
	
	@BeforeClass
	public void Open() {
		launchChrome("https://www.amazon.in/");
	}
	
	@Test
	public void SearchItem() throws InterruptedException, IOException {
		search = new SearchPage(driver);
		search.EnterItemToSearch(excel.Data());
		Thread.sleep(2000);
		search.ClickSearchButton();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void AddCart() throws InterruptedException {
		add = new CartPage(driver);
		add.SelectItem(); 
		SwitchWindow();
		Thread.sleep(2000);
		add.AddCart();
	}
	
	@Test(priority = 2)
	public void IncreaseQuantity() throws InterruptedException {
		add = new CartPage(driver);
		add.GoToCart();
		Thread.sleep(2000);
		add.IncreaseNumber();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void NewAccount() {
		account = new CreateAccountPage(driver);
		account.BuyProduct();
	}
	
	
	@AfterClass
	public void Stop() {
		CloseChrome();
		
	}
}
