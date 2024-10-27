package seleniumTesting;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPractice1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//Launch the Website
		String Name = "Admin";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Mahender");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Madhuri");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String forgotYourPassword = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println("Error messsage for entering wrong credentials: "+forgotYourPassword);
		//Click on Forgot Password link
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mahender");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Madhuri@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		//Click on Go To Login Button
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String successfulLogin = driver.findElement(By.xpath("//p[contains(text(),'successfully')]")).getText();
		System.out.println("Messsage after Successful Login: "+successfulLogin);
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'successfully')]")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+Name+",");
		//Click on Log out button
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	}
	
}
