package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Functional Testing for GitHUB login page
public class Prgm {
	WebDriver driver;
	@BeforeMethod()
    public void openApplication() {
   	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   		 driver= new ChromeDriver();
   		driver.get("https://github.com/login");
   		
	}
   
	
	@Test(dataProvider ="authentication")
	public void prfg(String username,String password ) {
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(username);
   		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
   					
   				driver.findElement(By.xpath("//input[@value='Sign in']")).click();
   				driver.findElement(By.xpath("//div[@class='Header-item position-relative d-none d-md-flex']")).click();
   				driver.findElement(By.xpath("//a[@href='/new']")).click();
   				driver.findElement(By.xpath("//input[@id='repository_name']")).sendKeys("qsprepository");
   			
    }
	
	@DataProvider(name="authentication")
	public Object[][] getData(){
		
		
		
		return new  Object[][] {
			{"premars26@gmail.com","qsp12345678"},
			{"premars26@gmail.com","qsp2233"},
			{"prema26@gmail.com","qsp12345678"},
			{"prema26@gmail.com","qsp345678"},
		{"prema22","qsp12345678"},
		{"prema","qsp12345678"},
		{"prema22","qsp1234dd5678"},
		{"prea22","qsp2345678"}
			
			
	
			};
		
	}
	
	@AfterMethod()
	public void closeApplication() {
		driver.quit();
	}
	
	}


