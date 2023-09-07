package stepDefinitions;

import pageObjects.LoginPage;
import io.cucumber.java.en.*;

public class Steps {
	
	LoginPage loginPage = new LoginPage();
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
		loginPage.lunchBrowser();
	}
	
	@When("User opens the URL")
	public void user_opens_the_url() {
		loginPage.openUrl("https://admin-demo.nopcommerce.com/login");
	}

	@When("User enter Email and Password")
	public void user_enter_email_and_password() {
		
		loginPage.enterUserName("admin@yourstore.com");
		loginPage.enterPassword("admin");
			
	   
	}

	@When("click on Login")
	public void click_on_login() {
		loginPage.clickLoginButton();
	}

	@Then("Verify the page Tittle")
	public void verify_the_page_tittle() {
		
		loginPage.pageTitle();
	}

	@When("User click on Logout Link")
	public void user_click_on_logout_link() {
		
		loginPage.clickLogout();
	}

	
	@Then("close browser")
	public void close_browser() {
		
		loginPage.closeBrowser();
	    
	}

	
	

}
