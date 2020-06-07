package com.company.projectwebdriver.cucumber.stepdefs;

import com.company.projectwebdriver.models.RedmineProject;
import com.company.projectwebdriver.pages.RedmineHomePageObject;
import com.company.projectwebdriver.pages.RedmineProjectPageObject;
import com.company.projectwebdriver.utils.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.Map;

public class WebRedmineCreateProjectStepDefs {

    BaseStepDefs baseStepDefs;
    RedmineProjectPageObject redmineProjectPageObject;

    public WebRedmineCreateProjectStepDefs(BaseStepDefs baseStepDefs) {
        this.baseStepDefs = baseStepDefs;
    }

    @And("I create a project")
    public void iCreateAProject(Map<String, String> projectDAta ) {

        RedmineHomePageObject redmineHomePageObject=(RedmineHomePageObject)baseStepDefs.currentPage; //castear para que no considere login y sea homepage
        redmineProjectPageObject=redmineHomePageObject.clickOnLink("Projects"); //al igual que en la creación de la clase RedmineProjectTest

        String number= Util.generateRandomNumber();  //autogenerar número aleatorio para que no se repita el nombre del proyecto al momento de crearlo

        RedmineProject redmineProject = new RedmineProject();
        redmineProject.setName(projectDAta.get("name") +number);
        redmineProject.setDescription(projectDAta.get("description") +number);
        redmineProject.setHomePage(projectDAta.get("homepage") +number);
        redmineProject.setPublic(Boolean.parseBoolean(projectDAta.get("public")));
        redmineProjectPageObject.createProject(redmineProject);

    }

    @Then("The project was successfully created")
    public void theProjectWasSuccessfullyCreated() {
        Assert.assertEquals("Successful creation.", redmineProjectPageObject.getUIMessage()); //mensaje debe ir al principio del equals
    }
}
