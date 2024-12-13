package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	WebDriver driver;
	
	public FacebookPage(WebDriver driver) {          
		this.driver = driver;
	}
	
	By Username_editbox = By.id("email");
	By password_editbox = By.id("pass");
	By Login_Btn = By.name("login");
	
	
	
	public void EnterUsername(String uname,String pass) {
		driver.findElement(Username_editbox).sendKeys(uname);
		driver.findElement(password_editbox).sendKeys(pass);
		
		}
	public void ClickBtn() {
		driver.findElement(Login_Btn).click();
	}
}
