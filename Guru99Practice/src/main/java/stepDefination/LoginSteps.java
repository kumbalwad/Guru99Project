package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps extends LoginPage {

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		browserLaunch();
	}

	@When("user enters the url {string}")
	public void user_enters_the_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Then("the title of page should be {string}")
	public void the_title_of_page_should_be(String title) {
		System.out.println("Title of the page is::"+getTitle());
		hardAssert(getTitle(), title);
	}

	@When("enters the valid username {string} and valid password {string}")
	public void enters_the_valid_username_and_valid_password(String str1, String str2) {
		enterCredential(str1, str2);
	}

	@And("user click on the login button")
	public void user_click_on_the_login_button() {
		clickOnLogin();
	}

	@When("user logout")
	public void user_logout() {
		logoutMethod();
	}

	@Then("user should close the browser")
	public void user_should_close_the_browser() {
		driver.close();
	}
	
	@Then("the title of page should be {string} and message should appear as {string}")
	public void the_title_of_page_should_be_and_message_should_appear_as(String title, String expectedMsg) {
	   
		hardAssert(title, getTitle());
		waitforsec(3);
		String actualMsg=driver.switchTo().alert().getText();
		hardAssert(expectedMsg, actualMsg);
	}
}
