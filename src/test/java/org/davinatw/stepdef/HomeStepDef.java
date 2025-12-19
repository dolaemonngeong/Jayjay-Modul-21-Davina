package org.davinatw.stepdef;

import io.cucumber.java.en.Then;
import org.davinatw.BaseTest;
import org.davinatw.Page.HomePage;

public class HomeStepDef extends BaseTest {
    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateBackButoonDisplayed();
    }
}
