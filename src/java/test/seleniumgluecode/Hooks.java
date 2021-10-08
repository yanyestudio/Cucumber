package test.seleniumgluecode;

import browser_manager.DriverManager;
import browser_manager.DriverManagerFactory;
import browser_manager.DriverType;
import io.cucumber.java.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {


        private static WebDriver driver;
        private static int numberOfCase=0;
        private DriverManager driverManager;


    @Before

    private void  setUp()  {
        numberOfCase++;
        System.out.println("Stage 2 step " + numberOfCase + " is running");
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
       // Thread.sleep(5000);
        driver.manage().window().maximize();
    }
        @After
        public void tearDown () {
            System.out.println("Stage 2 step " + numberOfCase + " was successfully executed");
            driverManager.quitDriver();
        }
        public static WebDriver getDriver() {
            return driver;
        }

    }



