package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	@FindBy (xpath="(//i[@class='ion-compose'])[1]")
	WebElement Home;
	@FindBy (xpath="//*[@id=\"root\"]/main/div/div/div/div/div[1]/ul/li[2]/button")
	WebElement GlobalFeed;
	@FindBy(xpath="//p[contains(text(),'Selenium tutorial by using java')]")
	WebElement articleName;
	@FindBy (xpath="//h1[contains(text(),'Selenium11')]")
	WebElement title;
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void navigationToGlobalFeed() throws InterruptedException {
		Thread.sleep(5000);
		Home.click();
		Thread.sleep(5000);
		GlobalFeed.click();
		
		
	}
	public void selectArticle() throws InterruptedException {
		Thread.sleep(5000);
		articleName.click();
	}
	public void viewArticle() throws InterruptedException {
		Thread.sleep(5000);
		
		String Title=title.getText();
		Assert.assertEquals(Title,"Selenium11");
		
	}
	
	

}
