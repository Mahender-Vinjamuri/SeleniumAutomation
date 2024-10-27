package seleniumTesting;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autosuggestive {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//*[contains(@class,'ui-menu-item')]/a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		// Handling checkboxes with Asssertions
		Assert.assertFalse(
				driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertEquals(driver.findElements(By.xpath("//*[@type='checkbox']")).size(), 6);

	}

}
