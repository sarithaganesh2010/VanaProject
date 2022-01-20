package com.intermedia.qa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.intermedia.qa.CucumberSeleniumMethods;

/**
 *
 */
public class SampleSteps  extends CucumberSeleniumMethods{


    @Given("Open the chromeBrowser and launch the googleUK")
    public void openTheChromeBrowserAndLaunchTheGoogleUK() throws Throwable {
        launchBrowser();
    }
    @Given("Open the Browser and launch the googleUK")
    public void openTheBrowserAndLaunchTheGoogleUK() throws Throwable {
        launchBrowser();
    }


    @When("I search for the (.*)$")
    public void iSearchForTheTerm(String term) throws Throwable {
        searchTxt(term);
    }
    @When("I searched for the (.*)$")
    public void iSearchedForTheTerm(String term) throws Throwable {
        searchTxt(term);
    }

//    @And("I click on the url to see (.*)$")
//    public void iClickOnTheUrlToSeeTitle(String title) throws Throwable {
//        seeTitle(title);
//    }

    @And("I should seen (.*)$")
    public void intermediaShouldbeSeen(String coukurl) throws Throwable {
        foundURLcouk(coukurl);

    }

    @Then("I should see (.*)$")
    public void iShouldSee(String urlstr) throws Throwable {
        foundUrl(urlstr);
    }

    @And("I should also see (.*)$")
    public void iShouldAlsoSeeTitle(String comurl) throws Throwable {
        foundURLCom(comurl);
    }
}
