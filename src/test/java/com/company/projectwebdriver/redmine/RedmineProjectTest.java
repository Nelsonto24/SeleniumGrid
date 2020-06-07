package com.company.projectwebdriver.redmine;

import com.company.projectwebdriver.base.BaseTest;
import com.company.projectwebdriver.models.RedmineProject;
import com.company.projectwebdriver.pages.RedmineHomePageObject;
import com.company.projectwebdriver.pages.RedmineProjectPageObject;
import com.company.projectwebdriver.utils.Util;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedmineProjectTest extends BaseTest {

    @Test
    public void testCreateprojectRedmine(){
        RedmineHomePageObject redmineHomePageObject=redmineLoginPageObject.login("user", "bitnami1");
        // redmineHomePageObject.clickOnLink("Projects"); funciona para invocar al método tipo void
        RedmineProjectPageObject redmineProjectPageObject=redmineHomePageObject.clickOnLink("Projects");

        String nroAleatorio= Util.generateRandomNumber();  //autogenerar número aleatorio para que no se repita el nombre del proyecto al momento de crearlo

        RedmineProject redmineProject = new RedmineProject();
        redmineProject.setName("Proyecto creado con Selenium" +nroAleatorio);
        redmineProject.setDescription("Descripción de la creación de proyecto con Selenium"+nroAleatorio);
        redmineProject.setHomePage("RedmineProjectName"+nroAleatorio);
        redmineProject.setPublic(true);
        redmineProjectPageObject.createProject(redmineProject);

        assertEquals("Successful creation.", redmineProjectPageObject.getUIMessage(), "El mensaje no es correcto");
        System.out.println("");
    }


}
