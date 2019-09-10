package seleniumConcepts;


import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.*;

import testngPractice.LaunchBrsr;

public class seleniumXpath extends LaunchBrsr {

// Facebook login automate
	
	@Test
	
	public void googleTitleText() throws InterruptedException {
		
		driver.manage().window().fullscreen();
		
		
	    driver.get("https://www.facebook.com/");	    
	   // Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testarun42013@yahoo.in");
	   // Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test@123");
	   // Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	  //  Thread.sleep(3000);
	    
	    boolean b1 = driver.findElement(By.xpath("//input[@type='text' and @name='q']")).isDisplayed();
	  //  Thread.sleep(3000);
	    
	    System.out.println(b1);
	  //  b1=false;
	    
	   Assert.assertEquals(b1, true,"element not found");
	    
		
	}
	
	

}
