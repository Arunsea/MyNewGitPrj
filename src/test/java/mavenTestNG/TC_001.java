package mavenTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001 extends LaunchBrsr {


	

	@Test   // as per low priority it will execute

	public void enterURL() {
		
		driver.get("https://www.flipkart.com");
		
		System.out.println("Enter the URL");
	}

	@Test

	public void searchProduct() {
		System.out.println("search the product");
		//Assert.fail();
	}

	//@Test

	public void verifyProduct() {
		System.out.println("verify the product");
		Assert.fail("Fail");
	}
	
	//@Test   // If priority of any test is not given, then it will execute this first. 
	//If more than 1 test are there without priority then it will execute randomly among those

	public void addToCart() {
		System.out.println("add to cart");
	}

	

	
	
}
