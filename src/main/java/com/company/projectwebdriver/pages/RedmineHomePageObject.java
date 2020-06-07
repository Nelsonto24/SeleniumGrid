package com.company.projectwebdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RedmineHomePageObject extends RedmineLoginPageObject {

    private By lblUserLogged = By.id("loggedas");
    private By menuMyPage = By.xpath("//a[@href='/my/page']");
    private By menuProjects = By.xpath("//a[@href='/projects']");
    private By menuAdmin = By.xpath("//a[@href='/admin']");
    private By menuHelp = By.xpath("//a[@href='https://www.redmine.org/guide']");

    public RedmineHomePageObject(WebDriver driver) {
        super(driver);
    }

    public String getUserLogged(){
        return driver.findElement(lblUserLogged).getText();
    }

    public RedmineProjectPageObject clickOnLink(String option){
        switch (option.toLowerCase()){
            case "my page":
                driver.findElement(menuMyPage).click();
                break;
            case "projects":
                driver.findElement(menuProjects).click();
                //return new RedmineProjectPageObject(driver); si se desea mostrar todos los PageObject de las demás opciones del menú
                break;
            case "administration":
                driver.findElement(menuAdmin).click();
                break;
            case "help":
                driver.findElement(menuHelp).click();
                break;
            default:
                throw new IllegalStateException("No se encuentra la opción "+option.toLowerCase()+" ingresada");
        }
        return new RedmineProjectPageObject(driver);
    }
}
