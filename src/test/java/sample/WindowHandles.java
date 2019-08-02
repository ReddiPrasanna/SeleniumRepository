package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandles {
	WebDriver driver;
  @Test
  public void SwtichingWindow() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   WebElement home=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[1]/a/span"));
	  WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	  WebElement ouroffcie=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	  WebElement chennai=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
	  WebElement Banglore=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(aboutus).click().build().perform();
	  
	  WebDriverWait wait=new WebDriverWait(driver,50);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(ouroffcie));
	  act.moveToElement(ouroffcie).click().build().perform();
	   
	  wait.until(ExpectedConditions.elementToBeClickable(chennai));
	  act.moveToElement(chennai).click().build().perform();
	  
	  String parentwindowid=driver.getWindowHandle();
	  
	  Set<String> set=driver.getWindowHandles();
	  
	  for(String s:set)
	  {
		  driver.switchTo().window(s);
		  
	  }
	  
	 driver.switchTo().frame(driver.findElement(By.name("main_page")));
	 String address=driver.findElement(By.id("demo3")).getText();
	 System.out.println(address);
	 driver.switchTo().window("parentwindowid");
	 
	 act.moveToElement(aboutus).click().build().perform();
	  
	  //WebDriverWait wait1=new WebDriverWait(driver,50);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(ouroffcie));
	  act.moveToElement(ouroffcie).click().build().perform();
	   
	  wait.until(ExpectedConditions.elementToBeClickable(Banglore));
	  
	  act.moveToElement(Banglore).click().build().perform();
Set<String> set1=driver.getWindowHandles();
	  
	  for(String s1:set1)
	  {
		  driver.switchTo().window(s1);
		  
	  }
	  
	 driver.switchTo().frame(driver.findElement(By.name("main_page")));
	 String address1=driver.findElement(By.id("demo3")).getText();
	 System.out.println(address1);
	  
	 
	 driver.quit();
	  
	  
  }
}
