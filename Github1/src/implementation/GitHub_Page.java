package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Page {

	@FindBy(xpath="//div[@class='Header-item position-relative d-none d-md-flex']")
	private WebElement plusbtn;
	
	@FindBy(xpath="//a[@href='/new']")
	private WebElement newrepositorybtn;
	
	@FindBy(xpath="//input[@id='repository_name']")
	private WebElement repositorytext;
	
	
	public	GitHub_Page( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void plausbtn() {
		plusbtn.click();
	}
	
		public void newrepository() {
			newrepositorybtn.click();
		}
		
		public void repositoryname() {
			repositorytext.sendKeys("qsprepository");
		}
	
}

	
