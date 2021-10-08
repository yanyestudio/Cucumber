package test.seleniumgluecode;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import test.Pages.Behaviour;

public class Test {
     Behaviour page_behaviour = new Behaviour();
      private WebDriver driver=  Hooks.getDriver();

    @Given("^User is on demo page$")
    public void Use_is_on_demo_page() throws Throwable {
        Assert.assertEquals(Hooks.class.getName(),"Hola");
        throw new PendingException();
    }
    @When("^click on Alerts and Modals$")
    public void click_on_Alerts_and_Modals() throws Throwable {
            page_behaviour.click_on_Alerts_and_Modals();
            throw new PendingException();
        }
    @Then("^Validate the message$")
    public void Validate_the_message() throws Throwable{
                page_behaviour.click_on_Alerts_and_Modals();
                throw new PendingException();
    }
}
