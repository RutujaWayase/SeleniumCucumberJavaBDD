package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	//can write manually on own as below
	/*
	@Given("user is on login page")
	public void verifyLoginPage() {
		
		System.out.println("Hello world");
		
	}
	*/
	
	//Obtain after running feature file
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		System.out.println("Inside Step - user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step - user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step - user clicks on login page");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is navigated to the home page");
	}




}
