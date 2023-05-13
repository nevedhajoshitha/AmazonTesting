package Base_Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static String url;

	public static WebDriver driver;
	
	public static void launchChrome(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void SwitchWindow() {
		Set<String> child = driver.getWindowHandles();
		Iterator<String> it = child.iterator();
		String main = it.next();
		String ch = it.next();
		driver.switchTo().window(ch);
	}

	public static void CloseChrome() {
		driver.quit();
	}

}
