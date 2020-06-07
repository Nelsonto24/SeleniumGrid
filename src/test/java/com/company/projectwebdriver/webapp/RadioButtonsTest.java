package com.company.projectwebdriver.webapp;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioButtonsTest {
    @Test
    public void choosingRadioButton() {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:C:/Users/Nelson/IdeaProjects/project-selenium-webdriver/webapp/radiobuttonstest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));  //findElements para buscar por toda la lista con el mismo nombre
        radioButtons.get(2).click();
        driver.quit();
    }

    @Test
    public void gettingRadioButtonValue() {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:C:/Users/Nelson/IdeaProjects/project-selenium-webdriver/webapp/radiobuttonstest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();  //si se coloca 0, se probaría caso con error

        String colorActual = "";

        for (WebElement radioButton : radioButtons) {  //for each para recorrer la lista
            if (radioButton.isSelected()) {
                colorActual = radioButton.getAttribute("value");  //obtiene el atributo valor del html
            }
        }

        assertEquals("green", colorActual, "No se encuentra la opción");  //valor esperado, actual, mensaje
        driver.quit();
    }
}
