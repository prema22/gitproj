package execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import design.BaseTest;
import implementation.GitHub_Page;
import implementation.LoginPage1;

public class GithubLogin  {

	public	WebDriver driver;
	//	@Test(dataProvider="authentication")
		@Test()
		public void GithubLoginpage() {
			
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    		 driver= new ChromeDriver();
    		driver.get("https://github.com/login");
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
			LoginPage1 lp=new LoginPage1(driver);
			lp.passemail("premars26@gmail.com");
			lp.passwordcall("qsp12345678");
			lp.signin();
			GitHub_Page gp= new GitHub_Page(driver);
			gp.plausbtn();
			gp.newrepository();
			gp.repositoryname();
			
			
			
		}
			
			
			
			
			
			
			
			
		}
			
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//WebDriver driver= new ChromeDriver();
	//driver.get("https://github.com/login");
	
/*driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(un);
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
			
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		driver.findElement(By.xpath("(//span[@class='dropdown-caret'])[1])")).click();
		driver.findElement(By.xpath("//a[@href='/new']")).click();*/
		
		
		
				

		
		/*@DataProvider(name="authentication")
		public Object[][] getData(){
			
			
			
			return new  Object[][] {
				{"premars26@gmail.com","qsp12345678"},
				//{"premars26@gmail.com","qsp2233"},
				//{"prema26@gmail.com","qsp12345678"},
				//{"prema26@gmail.com","qsp345678"},
			//	{"prema22","qsp12345678"},
				//{"prema","qsp12345678"},
			//	{"prema22","qsp1234dd5678"},
			//	{"prea22","qsp2345678"}
				
				
		
				};
			
		}
}	*/
		
	/*	@Test(dataProvider ="authentication1" )
		public  void loginvalidApplication(String un1,String pass1) {
			driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(un1);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass1);	

			driver.findElement(By.xpath("//input[@value='Sign in']")).click();}
			
			@DataProvider(name="authentication1")
			public Object[][] getData1(){
				
				
				
				return new  Object[][] {
					{"premars26@gmail.com","qsp12345678"},
					
					
					
			
					};
				
			}
			
		}
}*/
		


