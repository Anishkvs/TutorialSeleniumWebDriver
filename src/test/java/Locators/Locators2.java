package Locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2{
 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
		driver.findElement(By.id("chkboxTwo")).click();

		//Regular expression for Xpath:
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//Parent & have two child locators
	  //	-->> //div[@class='forgot-pwd-btn-conainer']/button[2]
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
	}

	
}
