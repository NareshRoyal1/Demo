package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ConduitLoginPage {
	@FindBy (name="email")
	WebElement Username;
	@FindBy (name="password")
	WebElement pwd;
	@FindBy (xpath="//button[contains(text(),'Login')]")
	WebElement LoginBtn;
	@FindBy (xpath="//a[@class='navbar-brand']")
	WebElement Title;
	public  ConduitLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validLogin(String StrUser , String StrPwd) {
		Username.sendKeys(StrUser);
		pwd.sendKeys(StrPwd);
		LoginBtn.click();
	}
	public void HomepageCheck() {
		String title=Title.getText();
		Assert.assertEquals(title,"conduit");
	}

}
