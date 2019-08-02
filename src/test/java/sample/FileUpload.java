package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	 static WebDriver driver;
	
@Test 
	public  void upload() throws AWTException {
		// TODO Auto-generated method stub
		Robot robot= new Robot();
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
	     driver.get("file:///C:/Users/training_c2d.02.11/Desktop/file.html");
	     
	     driver.findElement(By.id("1")).click();
	     robot.setAutoDelay(1000);
	     String path="C:\\Users\\training_c2d.02.11\\Desktop\\ReddiPrasanna.csv.docx";
	     StringSelection sel=new StringSelection(path);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	     robot.setAutoDelay(1000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     
	     robot.setAutoDelay(1000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     
	     
	     
	     
		

	}

}
