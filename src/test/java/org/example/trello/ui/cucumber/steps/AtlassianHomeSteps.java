package org.example.trello.ui.cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.trello.ui.pages.attlasian.AtlassianHome;

import static org.testng.Assert.assertTrue;

public class AtlassianHomeSteps {

    private final AtlassianHome home;

    /**
     * Constructor of Common steps.
     *
     * @param home AtlassianHome.
     */
    public AtlassianHomeSteps(final AtlassianHome home) {
        this.home = home;
    }

    /**
     * Step to verify  to the main page.
     */
    @Then("I verify if trello button is displayed")
    public void iVerifyToTheTrelloPage() {
        assertTrue(home.isDisplayedTrelloButton());
    }

    @When("I got to the trello page")
    public void iGoToTheTrelloPage() {
        home.clickTrelloButton();
    }
}
