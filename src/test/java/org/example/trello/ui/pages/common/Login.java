package org.example.trello.ui.pages.common;

import org.example.core.ui.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/**
 * this class represented a login page.
 */
public class Login extends AbstractPage {

    private static final String CSS_PROFILE = "button[data-test-id='header-member-menu-button'] > div[title*='%s']";

    public Login() {
        super();
        driver.get("https://start.atlassian.com/");
    }

    /**
     * Find name text field of page.
     */
    @FindBy(name = "user")
    private WebElement userTextField;

    /**
     * Find user name text field of page.
     */
    @FindBy(name = "username")
    private WebElement userNameTextField;
    /**
     * find password text field of page.
     */
    @FindAll({
            @FindBy(name = "password"),
            @FindBy(css = "[name='password']")
    })
    private WebElement passwordTextField;
    /**
     * Find login button of page.
     */
    @FindBy(id = "login")
    private WebElement loginButton;
    /**
     * Find login button of page.
     */
    @FindBy(id = "login-submit")
    private WebElement loginSubmitButton;

    /**
     * This method add one value of name text field .
     *
     * @param strName value of input.
     */
    protected void setUserTextField(final String strName) {
        action.waitVisibility(userTextField);
        action.setValue(userTextField, strName);
    }

    /**
     * This method add one value of username text field .
     *
     * @param strUserName value of input.
     */
    protected void setUserNameTextField(final String strUserName) {
        action.waitVisibility(userNameTextField);
        action.setValue(userNameTextField, strUserName);
    }

    /**
     * This method add one value of password text field .
     *
     * @param strPassword value of input.
     */
    protected void setPasswordTextField(final String strPassword) {
        action.waitVisibility(passwordTextField);
        action.setValue(passwordTextField, strPassword);
    }

    /**
     * this method is for has been click in button.
     */
    protected void clickLoginButton() {
        action.waitVisibility(loginButton);
        action.click(loginButton);
    }

    /**
     * this method is for has been click in button.
     */
    protected void clickLoginSubmitButton() {
        action.waitVisibility(loginSubmitButton);
        action.click(loginSubmitButton);
    }

    /**
     * This POM method will be exposed in test case to login in the application.
     *
     * @param strUserName username value input.
     * @param strPasword  passwor value input.
     */
    public void loginAs(final String strUserName, final String strPasword) {
        this.setUserNameTextField(strUserName);
        this.clickLoginSubmitButton();
        this.setPasswordTextField(strPasword);
        this.clickLoginSubmitButton();
    }
}

