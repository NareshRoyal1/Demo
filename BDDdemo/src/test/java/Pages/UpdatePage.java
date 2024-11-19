package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UpdatePage {
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
	@FindBy (xpath="//button[@type='submit']")
	WebElement updateArticle;
	@FindBy (xpath="//h1[contains(text(),'TitleUpdated')]")
	WebElement title;
	public  UpdatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void navigationtoArticleDetailPage() throws InterruptedException {
		Thread.sleep(5000);
		Home.click();
		Thread.sleep(5000);
		GlobalFeed.click();
		Thread.sleep(5000);
		articleName.click();
	}
	public void editArticle() throws InterruptedException {
		Thread.sleep(5000);
		editarticle.click();
		Thread.sleep(5000);
		Title.clear();
		Thread.sleep(5000);
		Title.sendKeys("TitleUpdated");
		Thread.sleep(5000);
		updateArticle.click();
		
	}
	public void updatedArticle() throws InterruptedException {
		Thread.sleep(5000);
		String Title=title.getText();
		Assert.assertEquals(Title, "updatedArticle");
	}

}
