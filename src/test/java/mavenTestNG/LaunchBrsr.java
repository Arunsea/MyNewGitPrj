package mavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LaunchBrsr {
	
	public WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {
		
		String path = "H:\\jars\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		System.err.println(" ****** Open browser ****** ");
	}
	
	
	
		
	@AfterClass

	public void closeBrowser() {
		
		driver.quit();
		System.err.println(" ****** close browser ****** ");
	}
	

	

}
