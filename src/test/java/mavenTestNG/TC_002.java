package mavenTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002 extends LaunchBrsr {


	@Test
	public void enterURL() {
		driver.get("https://www.amazon.com");
		System.out.println("Enter the URL");
	}

	@Test

	public void searchProduct() {
		System.out.println("search the product");
	}

	//@Test

	public void verifyProduct() {
		System.out.println("verify the product");
	}
	
	//@Test // when enabled is false, then it will ignore this test for execution

	public void addToCart() {
		System.out.println("add to cart");
		Assert.fail("Fail");
		
	}



	
	
}
