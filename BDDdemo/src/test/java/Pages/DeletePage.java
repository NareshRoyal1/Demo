package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeletePage {
	@FindBy (xpath="(//i[@class='ion-compose'])[1]")
	WebElement Home;
	@FindBy (xpath="//*[@id=\"root\"]/main/div/div/div/div/div[1]/ul/li[2]/button")
	WebElement GlobalFeed;
	@FindBy(xpath="//p[contains(text(),'Selenium tutorial by using java')]")
	WebElement articleName;
	@FindBy (xpath="(//a[@class='nav-link'])[2]")
	WebElement editarticle;
	@FindBy (name="title")
	WebElement Title;
	@FindBy (xpath="(//button[@class='btn btn-sm'])[1]")
	WebElement deleteArticle;
	@FindBy(xpath="//div[contains(text(),'Articles not available.')]")
	WebElement deletevalidate;
	public  DeletePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void deleteArticle() throws InterruptedException {
		Thread.sleep(5000);
		deleteArticle.click();
		Thread.sleep(5000);
		
		
	}
	
	public void deletevalidation() {
		
		String text=deletevalidate.getText();
		Assert.assertEquals(text, "Articles not available.");
		
	}
	
	

}
