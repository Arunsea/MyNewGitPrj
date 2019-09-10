package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssertPractice {

	 WebDriver driver;

	@BeforeTest

	public void setup() {
		
		System.out.println("******** START ***********");

		String path = "H:\\jars\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver(); // launch chrome
		
		ChromeOptions cho= new ChromeOptions();
		
		

		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		cho.addArguments("");
		
		driver.get("https://google.com");

	}
	
	@Test
	
	public void googleTitleText() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "title mismatch");
		
	}
	
	@Test
	
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		
		Assert.assertTrue(b);
	}
	
	@AfterTest
	
	public void tearDown() {
		driver.quit();
		System.out.println("******** END ***********");
	}

}
