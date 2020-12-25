package design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
     @BeforeMethod()
     public void openApplication() {
    	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    		 driver= new ChromeDriver();
    		driver.get("https://github.com/login");
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
     }
	
     @AfterMethod()
     public void closeApplication(){
    	 driver.quit();
     }
}
