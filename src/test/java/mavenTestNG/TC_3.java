package mavenTestNG;

import org.testng.annotations.Test;

public class TC_3 {



	@Test(priority=1)

	public void enterURL() {
		System.out.println("Enter the URL");
	}

	@Test(dependsOnMethods="enterURL",priority=2)

	public void searchProduct() {
		System.out.println("search the product");
	}

	@Test(priority=3)

	public void verifyProduct() {
		System.out.println("verify the product");
	}
	
	@Test(enabled=false) // when enabled is false, then it will ignore this test for execution

	public void addToCart() {
		System.out.println("add to cart");
		//Assert.fail("Fail");
		
	}



	
	
}
