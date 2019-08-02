package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class AjaxTest {
	WebDriver driver;
	
  @Test
  public void date() {
	  
	 By container=By.cssSelector(".demo-container");
	 WebDriverWait wait=new WebDriverWait(driver,5);
	 WebElement nodatetestelement=driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	 String textbeforeajaxcall=nodatetestelement.getText().trim();
	 System.out.println(textbeforeajaxcall);
	 
	 driver.findElement(By.linkText("2")).click();
	 By loader= By.className("raDiv");
	 wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	 
	 WebElement selecteddatetext=driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	 wait.until(ExpectedConditions.visibilityOf(selecteddatetext));
	 String textafterajaxcall=selecteddatetext.getText().trim();
	 
	 System.out.println(textafterajaxcall);
	 
	

	 /*driver.findElement(By.xpath("//button[@type='submit']/span")).click();
	 WebElement clearddatetext=driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	 wait.until(ExpectedConditions.visibilityOf(clearddatetext));
	 String clear=clearddatetext.getText().trim();
	 System.out.println(clear);*/
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
  
   driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
  }

  @AfterClass
  public void afterClass() {
  }

}
