package com.company.projectwebdriver.cucumber.stepdefs;

import com.company.projectwebdriver.base.BaseTest;
import com.company.projectwebdriver.pages.RedmineHomePageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
//import static org.junit.Assert.assertEquals;

public class WebRedmineLoginStepDefs {
    BaseStepDefs baseStepDefs;
    RedmineHomePageObject redmineHomePageObject;

    public WebRedmineLoginStepDefs(BaseStepDefs baseStepDefs) {
        this.baseStepDefs = baseStepDefs;
    }

    @Given("I go to the Redmine login page on URL")
    public void iGoToTheRedmineLoginPageOnURL() {
        System.out.println("I go to the Redmine login page on URL");
    }

    @When("I login with my credentials user {string} and {string}")
    public void iLoginWithMyCredentialsUserAnd(String user, String password) {
        redmineHomePageObject= baseStepDefs.currentPage.login(user, password);  //el método invocado login, devuelve un homepage,por eso se hace la igualdad al objeto declarado inicialmente en esta clase
        baseStepDefs.currentPage=redmineHomePageObject;
    }

    @Then("I should see the homepage with the username  {string}")
    public void iShouldSeeTheHomepageWithTheUsername(String username) {

        String userExpected = "Logged in as user";
        String userActual = redmineHomePageObject.getUserLogged();
        //assertEquals(userExpected, userActual, "Nombre de usuario no coincide");
        Assert.assertEquals(userExpected, userActual);
    }
}
