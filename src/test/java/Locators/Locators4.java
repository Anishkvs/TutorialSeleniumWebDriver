package Locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators4{
 
	public static void main(String[] args) throws InterruptedException {
		
	//Parent >> Child >> Sibling
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
	//Child >> Parent
		
		System.out.println(driver.findElement(By.xpath("//header/div/button/parent::div/button[3]")).getText());
		
		
	}
}
