package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    @Given("the user is on login page")
    public void the_user_is_on_login_page(){
        System.out.println("The user is on login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials(){
        System.out.println("Entered username and password");
    }
    @When("hits submit")
    public void hits_submit(){
        System.out.println("clicked on submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully(){
         System.out.println("Yeah I am Logged in");

    }
}
