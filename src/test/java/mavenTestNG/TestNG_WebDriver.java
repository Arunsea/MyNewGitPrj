package mavenTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG_WebDriver {

	public WebDriver driver;
		
	@BeforeMethod
	
	public void setup() {
		
		System.out.println(" *** Before Method *** ");
		
	String path = "H:\\jars\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();   // launch chrome
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
		
	}
	
	@Test
	
	public void googleGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	
	public void googlelogotext() {
		
		
	}
	
	
	@AfterMethod
	
	public void teardown() {
		
		System.out.println(" *** After Method *** ");
		driver.quit();
		
	}
	
	
	
	
	}
