package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.UtilityPage;

public class LoginPage extends UtilityPage {

	@FindBy(xpath = "//input[@name='btnLogin']")
	public WebElement loginBtn;

	@FindBy(xpath = "//label[@id='message23']//preceding::input")
	public WebElement username;

	@FindBy(xpath = "//label[@id='message18']//preceding-sibling::input")
	public WebElement password;

	@FindBy(xpath = "//a[text()='Log out']//parent::li")
	public WebElement logout;

	/*
	 * public LoginPage() {
	 *
	 * PageFactory.initElements(driver, this); }
	 */

	public void enterCredential(String user, String pass) {

		PageFactory.initElements(driver, this);
		Assert.assertTrue(isEnabled(username));
		username.clear();
		username.sendKeys(user);

		Assert.assertTrue(isEnabled(password));
		password.clear();
		password.sendKeys(pass);
	}

	public void clickOnLogin() {

		PageFactory.initElements(driver, this);
		Assert.assertTrue(isEnabled(loginBtn));
		loginBtn.click();
	}

	public void logoutMethod() {

		PageFactory.initElements(driver, this);
		Assert.assertTrue(isDisplayed(logout));
		waitforsec(3);
		logout.click();
		waitforsec(3);
		driver.switchTo().alert().accept();
	}
}
