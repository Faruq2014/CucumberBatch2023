package cucumber.stepDefinations;

import cucumber.RegistrationPages.RegistrationPage;
import cucumber.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest extends BaseTest{
	RegistrationPage regPage;

		@Given("User open app")
		public void userOpenApp() {
			setUp();  
		}
		@When("I complete registration page")
		public void iCompleteRegistrationPage() {
			regPage=new RegistrationPage(driver);
			regPage.clickCreateButton();
			regPage.enterFirstName("GGg");
			regPage.enterLastName("DDd");
			regPage.enterMobileOrEmail("89808098");
			//regPage.reEnterEmail("89808098");
			regPage.enterPassword("6yyyw");
			regPage.selectBirthday("Jan", "15", "2010");
			regPage.selectGenderFemale();
		}
		@When("I submit the app")
		public void iSubmitTheApp() {
			regPage.clickSignUpButton(); 
		}
		@Then("I should be registered")
		public void iShouldBeRegistered() {
			closeApp();
		}


}
