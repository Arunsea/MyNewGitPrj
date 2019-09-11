package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchSafariBrowser {

	public static void main(String[] args) throws InterruptedException {

		// For running tests in Safari browser need to have following

		// 1. Safari browser should be above 10+ version (windows its not available as
		// of now)
		// 2. We should install Safari extension for selenium
		// 3. Need to enable - Allow Remote Automation
		// 3.a Safari -> Preferences -> Advance -> Select checkbox 'Show develop menu in
		// menu bar'
		// 3.b Safari -> Develop -> Allow Remote automation

		WebDriver driver = new SafariDriver();

		driver.get("http://www.google.co.in");

		Thread.sleep(2000);

	}

}
