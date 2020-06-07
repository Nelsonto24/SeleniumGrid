package com.company.projectwebdriver.base;

import com.company.projectwebdriver.pages.RedmineLoginPageObject;
import com.company.projectwebdriver.utils.Urls;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.AfterAll;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
//import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected static RedmineLoginPageObject redmineLoginPageObject;

    @BeforeClass
    //@BeforeAll -> org.junit.jupiter.api.BeforeAll
    //@BeforeClass -> org.junit.BeforeClass
    //@Before -> io.cucumber.java.Before
    public static void setUp(){

        /*String browserName = System.getenv("browserName");
        browserName = (browserName != null) ? browserName.toLowerCase() : "";

        switch (browserName){
            case "firefox":
                setFirefoxDriverProperty();
                break;
            case "safari":
                setSafariDriverProperty();
                break;
            default:
                setChromeDriverProperty();
        }*/

        setChromeDriverProperty();
        //Implicit wait -> cada elemento de la página espera determinado tiempo hasta realizar una acción
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Urls.REDMINE_LOGIN);
        redmineLoginPageObject=new RedmineLoginPageObject(driver);

        /* lo implementa en el método para setear las propiedades del chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        */
    }

    @AfterClass  //@AfterAll
    public static void close(){
        driver.quit();
    }

    public static void setChromeDriverProperty(){
        if(System.getProperty("os.name").contains("Windows")){
            System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        }
        else{
                System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
            }
        driver=new ChromeDriver();
    }

   /* private static void setFirefoxDriverProperty(){
        if(System.getProperty("os.name").contains("windows")){
            System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");
        }
        else {
            System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver");
        }
        driver = new FirefoxDriver();
    }

    private static void setSafariDriverProperty(){

        driver = new SafariDriver();
    }*/

    public static WebDriver getDriver(){  //se crea éste método para utilizar el driver en la clase BaseStepDefs
        return driver;
    }
}
