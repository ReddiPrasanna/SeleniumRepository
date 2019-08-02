package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver ;
	 String Expectedresults="Find a Flight: Mercury Tours:";
	
  @Test()
  public void login() {
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.titleIs(Expectedresults));
	  Assert.assertEquals(Expectedresults, driver.getTitle());
	  
	  
	  
	  
  }
  
  
 /* @BeforeTest
  public void beforeTest() {
	  System.out.println("inside Before test");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("inside After test");
  }*/
  @BeforeClass
  public void beforeClass() {
	  /*System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.0\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       driver=new FirefoxDriver();*/
       System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
       driver.get("http://www.newtours.demoaut.com/");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("inside After class");
  }

}



