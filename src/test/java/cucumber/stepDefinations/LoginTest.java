package cucumber.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	@Given("user open browser and app")
	public void user_open_browser_and_app() {
	   System.out.println(">>>given>>>"); 
	}

	@When("user enter userName")
	public void user_enter_user_name() {
	    
	}

	@When("user enter password")
	public void user_enter_password() {
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    
	}

	@Then("I validate the landing page")
	public void i_validate_the_landing_page() {
	   
	}

}
