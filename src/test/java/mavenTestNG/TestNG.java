package mavenTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeMethod
	public void myfirstBeforemethod() {
		System.out.println("Before method");
	}

	@BeforeSuite

	public void BeforeSuite() {
		System.out.println("Before suite");
	}

	@Test

	public void openbrowser() {
		System.out.println("Open browser");
	}

	@Test

	public void enterURL() {
		System.out.println("Enter the URL");
	}

	@Test

	public void searchProduct() {
		System.out.println("search the product");
	}

	@Test

	public void verifyProduct() {
		System.out.println("verify the product");
	}

	@Test

	public void closeBrowser() {
		System.out.println("close the browser");
	}

	@AfterMethod
	public void myfirstAftermethod() {
		System.out.println("After method");
	}
}
