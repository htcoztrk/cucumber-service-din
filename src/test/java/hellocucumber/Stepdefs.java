package hellocucumber;


import hellocucumber.main.Service;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Random;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class Stepdefs {

    private String today;
    private String actualAnswer;

    private Service servis = new Service();

    @Given("^today is \"([^\"]*)\"$")
    public void today_is(String today) {
        this.today = today;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        this.actualAnswer = servis.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("Selam ver")
    public void selam_ver() {
        System.out.println("Selamun aleykum!");
    }

    @Given("Selam al")
    public void selam_al() {
        System.out.println("Ve aleykum selam!");
    }

    @Given("hatali ama tekrarda basarili")
    public void selam_al_deneme() {
        System.out.println("merhaba gardaş getProperty");
        //assertEquals(true, new Random().nextBoolean());

        String lastRetry = System.getProperty("lastRetry");
        String retryCount = System.getProperty("retryCount");
        System.out.println("MAKSAHIN lastRetry " + lastRetry);
        System.out.println("MAKSAHIN retryCount " + retryCount);
        if(lastRetry!=null && !lastRetry.isEmpty() && Boolean.parseBoolean(lastRetry)) {
            System.out.println("MAKSAHIN Test son kez tekrarlı çalışıyor!");
            assertEquals(true, true);
        } else {
            assertEquals(true, false);
        }

    }

    /*

    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @Given("^today is Friday$")
    public void today_is_Friday() {
        this.today = "Friday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

     */

}
