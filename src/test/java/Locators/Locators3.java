package Locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators3{
 
	public static void main(String[] args) throws InterruptedException {
		
		String name = "rahul";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String password = getPassword(driver);
		//getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		System.out.println(password);
		driver.findElement(By.id("chkboxTwo")).click();

		//Regular expression for Xpath:
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println((driver.findElement(By.tagName("p")).getText()));
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(1000);
		String pass = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login
		String ArrayPass = pass.split("'")[1];
		String ArrayPass2 = ArrayPass.split("'")[0];
		return ArrayPass2;
		// [0] = Please use temporary password
		// [1] = 'rahulshettyacademy' to Login
		
		
		
		
	}
	
}
