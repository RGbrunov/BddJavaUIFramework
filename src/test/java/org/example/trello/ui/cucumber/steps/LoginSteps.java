package org.example.trello.ui.cucumber.steps;

import io.cucumber.java.en.Given;
import org.example.core.Environment;
import org.example.core.ui.Commons;
import org.example.trello.ui.pages.common.Login;

/**
 * Common steps.
 */
public class LoginSteps {

    private static final Environment ENVIRONMENT = Environment.getInstance();
    private Login login;

    /**
     * Constructor of Common steps.
     *
     * @param login Login.
     */
    public LoginSteps(final Login login) {
        this.login = login;
    }


    /**
     * Given of in page of trello.
     *
     * @param key for start session.
     */
    @Given("I Log in with user {string}")
    public void iLogInWithUser(final String key) {
        String userNameKey = String.format("$['credentials']['%s']['username']", Commons.getUserFromKey(key));
        String passwordKey = String.format("$['credentials']['%s']['password']", Commons.getUserFromKey(key));
        login.loginAs(ENVIRONMENT.getValue(userNameKey), ENVIRONMENT.getValue(passwordKey));
    }
}
