package test.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import test.utilPom.Page_Base;

public class Behaviour extends Page_Base{
    static By registerTitMenu= By.name("Menu List");
    static By registerMenu = By.xpath("//*[@id=\"easycont\"]/div/div[1]/div/div[1]");
    static By registerBotonaceptar =        By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[1]");
    static By registerBotonClickme =        By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");
    static By registerLinkAlertModal =      By.xpath("//*[@id='treemenu']/li/ul/li[5]/a") ;       //By.linkText("Alerts & Modals");
    static By registerNameRAlertModal =     By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button") ;    //  By.linkText("registerLinkAlertModal");

    Page_Base page_base= new Page_Base();


    public void Use_is_on_demo_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(5000);
    }

    public void click_on_Alerts_and_Modals() throws Throwable{
        driver.findElement(registerLinkAlertModal).click();
        System.out.println("3.Alerts & Modal");
        Thread.sleep(2000);
        driver.findElement(registerNameRAlertModal).click();
    }

    public void Validate_the_message() throws Throwable{
        System.out.println("4.Click on �Click for Prompt Box");
        Alert simpleAlert= driver.switchTo().alert();

        String text2 = simpleAlert.getText();
        System.out.println("5.On the PopUp write a message");
        System.out.println(simpleAlert.getText());

        Thread.sleep(4000);
        System.out.println("6.Validate the message and click on �Aceptar�");
        simpleAlert.accept();
        System.out.println("7.Validate the message that appears is the same as the one I typed�");

        if(text2.equals("I am an alert box!")) {
            System.out.println("this is the correct message :Press a button!");
        }
        else {
            System.out.println("this is not  the correct message : "+text2);
        }
        Thread.sleep(2000);
        //driver.quit();
    }
}
