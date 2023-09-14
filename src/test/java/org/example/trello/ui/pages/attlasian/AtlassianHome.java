package org.example.trello.ui.pages.attlasian;

import org.example.core.ui.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AtlassianHome extends AbstractPage {

    public AtlassianHome() {
        super();
    }

    /**
     * Find name text field of page.
     */
    @FindBy(css = "div[data-testid='start-product__TRELLO_TRELLO']")
    private WebElement trelloButton;

    /**
     * this method is for has been click in button.
     */
    public void clickTrelloButton() {
        action.waitVisibility(trelloButton);
        action.click(trelloButton);
    }

    /**
     * this method is to verify if the button locator is visible.
     *
     * @return true if the locator is visible.
     */
    public boolean isDisplayedTrelloButton() {
        action.waitVisibility(trelloButton);
        return trelloButton.isDisplayed();
    }
}
