package seleniumTesting;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		/*
		 * driver.navigate().to("https://rahulshettyacademy.com");
		 * driver.navigate().back(); driver.navigate().forward();
		 */
		System.out.println(driver.findElements(By.xpath("//ul[@class='navbar-nav ml-auto']/li/a")).size());
		int totalLinks = driver.findElements(By.xpath("//ul[@class='navbar-nav ml-auto']/li/a")).size();
		for(int i=1;i<totalLinks;i++)
		{
			String clickonEachLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(500);
			driver.findElements(By.xpath("//ul[@class='navbar-nav ml-auto']/li/a")).get(i).sendKeys(clickonEachLink);
			System.out.println(driver.getCurrentUrl());
			System.out.println("************************");
			
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
