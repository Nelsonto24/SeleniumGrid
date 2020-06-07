package com.company.projectwebdriver.cucumber.stepdefs;

import com.company.projectwebdriver.pages.RedmineLoginPageObject;
import com.company.projectwebdriver.base.BaseTest;
public class BaseStepDefs {

    protected RedmineLoginPageObject currentPage;  //si se usa private, el objeto currentPage no será reconocido en la clase WebRedmineLoginStepDefs

    public BaseStepDefs(){
        currentPage=new RedmineLoginPageObject(BaseTest.getDriver());  //con el objeto currentPAge, se pueden obterner los métdodos contenidos en la clase loginpageobjetc
    }
}
