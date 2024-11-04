package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExecutionSetDemo {

	@Given("User has repo cloned to local IDE")
	public void user_has_repo_cloned_to_local_ide() {
	    System.out.println("User cloned repo to local");
	}

	@And("User executes the file with topic name {string}")
	public void user_executes_the_file_with_topic_name(String string) {
		System.out.println("user executes file create topic with name Test Topic1");
	}

	@When("User navigates to {string}")
	public void user_navigates_to(String string) {
		System.out.println("Uuser navigates to kafdrop localhost:9090");
	}

	@And("user scrolls to test topics")
	public void user_scrolls_to_test_topics() {
		System.out.println("User verifies created topic");
	}

	@Then("User is able to see {string} in the list")
	public void user_is_able_to_see_in_the_list(String string) {
		System.out.println("User verifies test topic 1 in list of created topics");
	}

}
