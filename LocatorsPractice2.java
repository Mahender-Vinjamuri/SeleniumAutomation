package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		String Name = "Mahender";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String password = getPassword(driver);
		//Click on Go To Login Button
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'successfully')]")).getText());

	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String resetLogin = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println("Error messsage for Reset Login: "+resetLogin);
		String[] passwordArray = resetLogin.split(" ");
		String password = passwordArray[4].replace("'", "");
		return password;
	}

}
