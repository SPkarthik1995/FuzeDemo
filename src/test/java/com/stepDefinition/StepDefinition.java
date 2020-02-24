package com.stepDefinition;

import com.baseClass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
		driver=launchBrowser();
		 maxi();
       loadUrl("https://www.nesmaairlines.com/") ;
      
	    
	}

	@Given("User click on the demo menu")
	public void user_click_on_the_demo_menu() {
	  
	}

	@When("User fill the following credentials {string}  {string} and {string}")
	public void user_fill_the_following_credentials_and(String string, String string2, String string3) {

	}

	@Then("User click the Schedule a demo button")
	public void user_click_the_Schedule_a_demo_button() {
	   
	}



}
