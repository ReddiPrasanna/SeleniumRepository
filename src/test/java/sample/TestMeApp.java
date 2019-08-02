package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestMeApp {
	WebDriver driver;
	
  @Test(enabled= false)
  public void testapp() {
	  
	  WebElement home=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[1]/a/span"));
	  WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	  WebElement ouroffcie=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	  WebElement chennai=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
	  
	  /*Actions act=new Actions(driver);
	  act.moveToElement(aboutus).click().build().perform();
	  
	  WebDriverWait wait=new WebDriverWait(driver,50);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(ouroffcie));
	  act.moveToElement(ouroffcie).click().build().perform();
	   
	  wait.until(ExpectedConditions.elementToBeClickable(chennai));
	  act.moveToElement(chennai).click().build().perform();*/
	  
	  /* wait.until(ExpectedConditions.elementToBeClickable(home));
	   act.moveToElement(home).click().build().perform();*/
	  
	  
	  WebElement search=driver.findElement(By.id("myInput"));
	  Actions act=new Actions(driver);
	  act.keyDown(search,Keys.SHIFT).perform();
	  act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").pause(3000).click(search).build().perform();
	  
	  //search.sendKeys("bag");
	 
	  
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.switchTo().window("search");
	  String text=driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
			  Assert.assertTrue(text.contains("Hand bag"));
	  
	  
  }  
			  
  @Test
  public void popup() {
	  
	  
	  	driver.findElement(By.xpath("//input[@type='submit']")).click();
	  	String alertMessage=driver.switchTo().alert().getText();
	  	driver.switchTo().alert().accept();
	  	System.out.println(alertMessage);
			  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
     driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
