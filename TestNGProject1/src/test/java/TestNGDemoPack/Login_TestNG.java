package TestNGDemoPack;

import org.testng.annotations.Parameters;
import org.testng.asserts.*;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TestNG {
	SoftAssert softassert = new SoftAssert();
	@Parameters({"url", "validemail", "validpassword"})
	@Test
	public void verifyLoginWithValidCredentials(String URL ,String validemail, String validpassword )
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get(URL);
		driver.findElement(By.className("caret")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys(validemail);
		driver.findElement(By.id("input-password")).sendKeys(validpassword);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']"));
		
		softassert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		driver.quit();
		
	}
	@Parameters({"url", "invalidemail", "validpassword"})
	@Test
	public void verifyLoginWithInvalidCredentialsEmail(String URL, String invalidemail, String validpassword)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(URL);
		driver.findElement(By.className("caret")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys(invalidemail);
		driver.findElement(By.id("input-password")).sendKeys(validpassword);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissibl')]")).getText().contains("No match for E-Mail Address and/or Password"));
		
		driver.quit();
	}
	
	@Parameters({"url", "validemail", "invalidpassword"})
	@Test
	public void verifyLoginWithInvalidCredentialsPassword(String URL, String validemail, String invalidpassword)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(URL);
		driver.findElement(By.className("caret")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys(validemail);
		driver.findElement(By.id("input-password")).sendKeys(invalidpassword);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissibl')]")).getText().contains("No match for E-Mail Address and/or Password"));
		
		driver.quit();
	}
}
