package seleniumTesting;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String mailidText = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String mailId = mailidText.split(" ")[4];
		System.out.println(mailId);
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(mailId);

	}

}
