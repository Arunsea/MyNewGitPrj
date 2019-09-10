package exercisePropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PropertyFileHandling {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "\\TestData\\config.properties";
		// System.out.println(path);

		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();

		prop.load(fis);

		String weblink = prop.getProperty("url");
		System.out.println(weblink);

		String br = prop.getProperty("browser");
		System.out.println(br);

		if (br.contains("chrome")) {

			String path1 = "H:\\jars\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path1);
			driver = new ChromeDriver(); // launch chrome

			driver.get(weblink);
			driver.quit();
		}

		else if (br.contains("firefox")) {

			String path2 = "H:\\jars\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path2);
			driver = new FirefoxDriver();

			driver.get(weblink);
			driver.quit();
		}

		else if (br.contains("internet explorer")) {

			String path3 = "H:\\jars\\drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", path3);
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();

			driver.get(weblink);
			driver.quit();
		}

		else {
			System.err.println("Expected browser out of 'Chrome' , 'Firefox', 'Internet explorer' is not specified");
		}

	}

}
