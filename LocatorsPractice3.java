package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'top-right')]/div[2]/a")).getText());
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.findElement(By.xpath("//div/button[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button[2]/parent::div/button[1]")).getText());
		
	}

}
