package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Action {
	WebDriver driver ;
  @Test
  public void gmail() {
	  
	  /*WebElement gmail=driver.findElement(By.linkText("Gmail"));
	
	  Actions act=new Actions(driver);
	  act.clickAndHold(gmail).build().perform();*/
	  
	  WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	  
	  Actions act=new Actions(driver);
	  //act.dragAndDrop(resize, target)
	  act.dragAndDropBy(resize, 350, 200).build().perform();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
     //driver.get("https://www.google.com/");
     driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
     
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
