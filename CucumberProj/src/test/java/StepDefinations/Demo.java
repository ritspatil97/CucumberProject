package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {

	@Given("^I am a \"([a-zA-Z]{1,})\" QA$")
    public void i_am_a_type_qa(String behaviour) {
		
		System.out.println("------I am "+behaviour+" type of tester ");
    }

    @When("^I go to work$")
    public void i_go_to_work() {
    	
    	System.out.println("------I go to work");
    }
 
    @Then("^Boss \"([a-zA-Z]{1,})\" me$")
    public void boss_todo_me(String todo){
    	System.out.println("-----then my boss"+todo+" me ");
    	
    }
    @And("^I \"([a-zA-Z]{1,})\" with it$")
    public void I_action_with_it(String action) {
    	
    	System.out.println("-------i"+action+" with it ");
    	
    }
	
	
}
