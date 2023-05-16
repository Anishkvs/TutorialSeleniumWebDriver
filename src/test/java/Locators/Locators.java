package Locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators{
 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("username");
		driver.findElement(By.name("inputPassword")).sendKeys("pass");
		driver.findElement(By.className("signInBtn")).click();
/*
 * Css Selector
 *   tagname.classname
 *   <p class="error">* Incorrect username or password </p>
 *   
 *  Css Selector = p.error		
 */
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("TestName");

	/*Xpath
	 *<input type="text" placeholder="Name">
	 *
	 *  //tagName[@attribute='value']
	 * Xpath = //input[@placeholder='Name']
	 * Css   =   input[placeholder='Name'] 
	 */
	
	//	find Xpath/Css in Console
/*   
 *  Css	=   $('input[placeholder="Username"]')
 *  Xpath = $x('//input[@placeholder="Username"]')
 *  		
 */
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
//Css multiple element
	//tagName[attribute='value']:nth-child(3)  -->> child items in Css
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("anotherMail@gmail.com");
//Xpath: 
	//ParentTagName/ChildTagName
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("984300000");
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//Regular Expression: Xpath/Css Identify text on Partial text
	/*
	 * Css = input[type='password']  -->> last four word are changing randomly
	 * Css Regular expression = input[type*='pass']
	 * 
	 * 
	 */
	
			
	}

	
}
