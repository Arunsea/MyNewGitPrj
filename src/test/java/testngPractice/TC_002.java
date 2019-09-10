package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002 extends LaunchBrsr {


	@Test
	public void enterURL() {
		driver.get("https://www.amazon.com");
		System.out.println("TC002: Enter the URL");
	}

	@Test

	public void searchProduct() {
		System.out.println("TC002: search the product");
	}

	@Test

	public void verifyProduct() {
		System.out.println("TC002: verify the product");
	}
	
	@Test // when enabled is false, then it will ignore this test for execution

	public void addToCart() {
		System.out.println("TC002: add to cart");
		//Assert.fail("Fail");
		
	}



	
	
}
