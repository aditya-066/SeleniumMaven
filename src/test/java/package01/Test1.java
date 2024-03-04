package package01;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	@Test
	public void method1() {
		WebDriver driver = getWebDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		
		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		List<WebElement> testYuiItems = driver.findElements(By.xpath("//a[@role='menuitem']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(testYuiItems));
		
		for(int i =0;i<testYuiItems.size();i++) {
			String testYuiItem = testYuiItems.get(i).getText();
			if(testYuiItem.equalsIgnoreCase("Logout")) {
				testYuiItems.get(i).click();
				break;
			}
		}
		driver.close();
	}
	
	@Test
	public void method2() {
		WebDriver driver = getWebDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}

}
