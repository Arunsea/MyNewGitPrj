package mavenTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_2  {


	

	@Test(priority=1)   // as per low priority it will execute

	public void enterURL() {
		System.out.println("Enter the URL");
	}

	@Test(priority=2, description="this method is used for search product")

	public void searchProduct() {
		System.out.println("search the product");
		//Assert.fail();
	}

	@Test(priority=3)

	public void verifyProduct() {
		System.out.println("verify the product");
	}
	
	@Test(priority=4)   // If priority of any test is not given, then it will execute this first. 
	//If more than 1 test are there without priority then it will execute randomly among those

	public void addToCart() {
		System.out.println("add to cart");
	}

	

	
	
}
