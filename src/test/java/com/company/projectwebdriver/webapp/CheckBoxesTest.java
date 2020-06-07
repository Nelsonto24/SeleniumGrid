package com.company.projectwebdriver.webapp;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesTest {

    @Test
    public void selectingCheckBox(){

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:C:/Users/Nelson/IdeaProjects/project-selenium-webdriver/webapp/checkboxestest.html");
        WebElement checkbox= driver.findElement(By.id("lettuceCheckbox"));
        checkbox.click(); //selecciona el elemento
        checkbox.click(); //deselecciona el elemento
        driver.quit();

    }
}
