package seleniumTesting;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowScrolls {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		int total = 0;
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead'] //table/tbody/tr/td[4]"));
		for (int i = 0; i < values.size(); i++) {
			total = total + Integer.parseInt(values.get(i).getText());
		}
		String totalAmountFromApp = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		String[] totalAmount = totalAmountFromApp.split(":");
		Assert.assertEquals(total, Integer.parseInt(totalAmount[1].trim()));
		
	}

}
