package com.company.projectwebdriver.redmine;

import com.company.projectwebdriver.base.BaseTest;
import com.company.projectwebdriver.pages.RedmineHomePageObject;
import com.company.projectwebdriver.pages.RedmineLoginPageObject;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedmineTest extends BaseTest {

    /*@BeforeAll
    public static void launchApp(){
        driver.get("http://192.168.0.7:8081/login");
    }*/

    @Test
    public void loginRedmine(){

        String user = "user", password = "bitnami1";
        String userExpected = "Logged in as user";

        //RedmineLoginPageObject redmineLoginPageObject = new RedmineLoginPageObject(driver);  //recibe el driver instanciado en el constructor de la clase page object
        RedmineHomePageObject redmineHomePageObject =  redmineLoginPageObject.login(user, password);

        String userActual = redmineHomePageObject.getUserLogged();
        assertEquals(userExpected, userActual, "Nombre de usuario no coincide");
    }

    @Test
    public void loginOld(){
        //System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER_PATH"); 1era forma: definir con un nombre, la ruta del ejecutable desde la ventana de edit configuration
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");  //2 da forma: establecer propiedades como si fuera variable de entorno
        WebDriver driver = new ChromeDriver();  //instanciar objeto driver, WebDriver es una interface
        driver.get("http://192.168.0.7:8081");  //abrir navegador
        assertEquals("Redmine", driver.getTitle(),"El titulo de la página no es el correcto"); //compara el esperado, con el actual, 3er valor es un mensaje
        WebElement linkLogin=driver.findElement(By.linkText("Iniciar sesión"));  //F12 en el navegador, seleccionar el elemento y el id indica el valor a buscar
        linkLogin.click();
        WebElement txtUsername=driver.findElement(By.id("username"));
        txtUsername.sendKeys("user");
        WebElement txtPassword=driver.findElement(By.name("password"));
        txtPassword.sendKeys("bitnami1");
        WebElement btnLogin=driver.findElement(By.xpath("//*[@id=\"login-submit\"]"));
        btnLogin.click();
        WebElement lbLogin=driver.findElement(By.xpath("//*[@id=\"loggedas\"]"));
        lbLogin.click();
        String actualUser=lbLogin.getText();
        String expectedUser="Logged in as user";
        assertEquals(expectedUser, actualUser, "El usuario no ingresó correctamente");  //el assert solo se hacen en los @Test
        //Usar solo para probar nuestra automatización, no es una buena práctica dejar los Thread en el código
        /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        driver.quit();
    }
}
