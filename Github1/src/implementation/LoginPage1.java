package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	@FindBy(id="login_field")
	private WebElement emailid;
	
	@FindBy(id="password")
	private WebElement password;

	@FindBy(css="input[type='submit']")
	private WebElement signinbtn;
	
public	LoginPage1( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void passemail(String un) {
		emailid.sendKeys(un);
	}
	public void passwordcall(String pass) {
		password.sendKeys(pass);
	}
	
	public void signin() {
		signinbtn.click();
	}
	
}
