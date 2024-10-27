package seleniumTesting;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		String[] itemsNeeded = {"Cucumber","Orange", "Potato", "Almonds", "Walnuts"};
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@class='promoCode']"))));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j=0;
		for(int i=0; i<products.size();i++)
		{
			String name = products.get(i).getText();
			String[] productName = name.split("-");
			String finalProduct = productName[0].trim();
			if(itemsNeededList.contains(finalProduct))
			{
				j++;
				driver.findElement(By.xpath("//*[contains(text(),'"+finalProduct+"')]/following-sibling::div[2]/button")).click();
				if(j==itemsNeededList.size())
					break;
			}
		}
	}

}
