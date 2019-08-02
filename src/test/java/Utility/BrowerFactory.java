package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerFactory {

	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browserName,String url)
	{
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.0\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		       driver=new FirefoxDriver();
		}
		else if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
			
	}
		
		
}
