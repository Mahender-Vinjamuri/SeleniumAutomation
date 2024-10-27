package seleniumTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement webelement = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dropdown = new Select(webelement);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		// Selecting 5 Adults
		System.out.println(driver.findElement(By.xpath("//*[@id='divpaxinfo']")).getText());
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		}

		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='divpaxinfo']")).getText());
		// Selecting one way From & Destination
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //*[@value='CJB']")).click();
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='GOI']"))
				.click();

	}

}
