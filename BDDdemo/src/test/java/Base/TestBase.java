package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	private static TestBase testbase;
	private static WebDriver driver;
	
	private TestBase() {
		String StartBrowser="Chrome";
		if(StartBrowser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		if(StartBrowser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		System.out.println("Init driver ....."+driver);
	}
	public static void InitDriver() {
		if(testbase==null)
			testbase= new TestBase();
	}
	public static WebDriver getDriver() {
		driver=new ChromeDriver();
		return driver;
	}
	public static void openUrl(String url) {
		driver.get(url);
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		testbase=null;
	}


}
