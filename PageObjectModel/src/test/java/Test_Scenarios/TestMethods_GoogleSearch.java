package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
//import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	
	WebDriver driver;
	GoogleSearchPage googleSearchPage;
	GoogleSearchPage objectrepo;
	FacebookPage loginbtn;

	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		 driver.manage().window().maximize();
	}
	
	@Test
	public void SearchOparation() throws InterruptedException  {

		 googleSearchPage = new GoogleSearchPage(driver);
		 googleSearchPage.searchgoogle("Facebook");
	}
	
	@Test
	public void VerifyandAccessFacebook(){
		objectrepo = new GoogleSearchPage(driver);
		objectrepo.ClickFacebook();
	}
	
	@Test
	public void FacebookLoginUser() {
		FacebookPage facebookPage = new FacebookPage(driver);
		facebookPage.EnterUsername("rudranarayan376@gmail.com", "9861180608Rudra");
	}
	
	@Test
	public void FacebookLogin() {
		 loginbtn= new FacebookPage(driver);
		 loginbtn.ClickBtn();
	}
	
	@AfterTest
	public void aftertest() {
//		driver.quit();
	}
	
}





















