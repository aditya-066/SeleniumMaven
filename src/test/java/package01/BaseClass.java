package package01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver getWebDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		
		return driver;
		
	}

}
