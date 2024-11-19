package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newArticlePage {
	@FindBy (xpath="(//i[@class='ion-compose'])[2]")
	WebElement newArticle;
	@FindBy (name="title")
	WebElement ArticleTitle;
	@FindBy (xpath="(//input[@class='form-control '])[1]")
	WebElement ArtcleDescription;
	@FindBy(name="body")
	WebElement ArticleBody;
	@FindBy (name="tags")
	WebElement ArticleTags;
	@FindBy (xpath="//button[contains(text(),'Publish Article')]")
	WebElement Submit;
	@FindBy (xpath="(//button[@class='btn btn-sm'])[1]")
	WebElement edit;
	@FindBy (xpath="//a[@class='preview-link']")
	List<WebElement> articles;
	@FindBy (xpath="(//i[@class='ion-compose'])[1]")
	WebElement Home;
	
	public  newArticlePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CreateNewArticle(String Title,String description,String body,String tags) throws InterruptedException {
		
		
		ArticleTitle.sendKeys(Title);
		Thread.sleep(5000);
		ArtcleDescription.sendKeys(description);
		Thread.sleep(5000);
		ArticleBody.sendKeys(body);
		Thread.sleep(5000);
		ArticleTags.sendKeys(tags);
		Thread.sleep(5000);
		Submit.click();
		Thread.sleep(10000);
		
	}
	public void newarticlePage() throws InterruptedException {
	Thread.sleep(5000);
		newArticle.click();
		
	}
	
	public void articleCreated() throws InterruptedException {
		
		Thread.sleep(10000);
		Home.click();
		Thread.sleep(5000);
		for(WebElement article:articles) {
			String articleName=article.getText();
			if(articleName.equalsIgnoreCase("Selenium Tutorial10")) {
				System.out.println("article is created successfully");
			}
		}
	}
	

}
