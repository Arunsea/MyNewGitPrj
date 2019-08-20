package mavenTestNG;

import org.testng.annotations.Test;

public class TestNG {

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
	
	
}
