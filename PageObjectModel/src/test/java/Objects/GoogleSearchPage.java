package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	By searchbox = By.name("q");
	By Facebook_Link = By.xpath("//h3[text()='Facebook - log in or sign up']");
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchgoogle(String searchinput) throws InterruptedException {
		
		driver.findElement(searchbox).sendKeys(searchinput, Keys.ENTER);
	}
	
	public void ClickFacebook() {
		try {
			driver.findElement(Facebook_Link).click();
		}catch(Exception e) {
			System.out.println("Execution caught"+e.getMessage());
		}
	}
}
