$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/company/projectwebdriver/cucumber/features/01-web-redmine-login.feature");
formatter.feature({
  "name": "Desktop WEB UI Redmine Login",
  "description": "  As a user,\n  I want to be able to login on Redmine",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User inputs correct username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to the Redmine login page on URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.company.projectwebdriver.cucumber.stepdefs.WebRedmineLoginStepDefs.iGoToTheRedmineLoginPageOnURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login with my credentials user \"user\" and \"bitnami1\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.company.projectwebdriver.cucumber.stepdefs.WebRedmineLoginStepDefs.iLoginWithMyCredentialsUserAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the homepage with the username  \"user\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.company.projectwebdriver.cucumber.stepdefs.WebRedmineLoginStepDefs.iShouldSeeTheHomepageWithTheUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com/company/projectwebdriver/cucumber/features/02-web-redmine-projects.feature");
formatter.feature({
  "name": "Desktop WEB UI - Redmine - Projects",
  "description": "  As a user\n  I want to ...",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a Project",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to the Redmine login page on URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.company.projectwebdriver.cucumber.stepdefs.WebRedmineLoginStepDefs.iGoToTheRedmineLoginPageOnURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login with my credentials user \"user\" and \"bitnami1\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.company.projectwebdriver.cucumber.stepdefs.WebRedmineLoginStepDefs.iLoginWithMyCredentialsUserAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a project",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.company.projectwebdriver.cucumber.stepdefs.WebRedmineCreateProjectStepDefs.iCreateAProject(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The project was successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "com.company.projectwebdriver.cucumber.stepdefs.WebRedmineCreateProjectStepDefs.theProjectWasSuccessfullyCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});