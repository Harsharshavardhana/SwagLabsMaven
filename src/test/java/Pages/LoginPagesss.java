package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagesss {
	WebDriver driver;
	// ======objects=======//
	// PageFactory
	@FindBy(id = "user-name")
	WebElement userName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	// ==========methods==========//
	public LoginPagesss(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String UserName, String Password) {
		userName.sendKeys(UserName);
		password.sendKeys(Password);
		loginBtn.click();
	}
}
