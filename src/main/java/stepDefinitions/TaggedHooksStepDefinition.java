package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {
	@Before
	public void beforescenario() {
		
	}
	@After
	public void afterscenerio() {
		
	}
	@Before("@First")
	public void beforefirstscenario(){
	}
	@After("@Second")
	public void aftersecondsenerio(){
		
	}
	@Given("^this is the first step$")
	public void this_is_the_first_step(){
	    
	}

	@When("^this is the second step$")
	public void this_is_the_second_step(){
	    
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step(){
	    
	}


}
