package Pages;

import DriverSingleton.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void login(){
        pressSignin();
        pressLogin();
        enterCredentials();
        pressSigninAfterEnterCredentials();
    }

    private void pressSignin(){
        clickElement(By.cssSelector("div[data-ember-action=936]"));
    }
    private void pressLogin(){
        clickElement(By.cssSelector("div[data-ember-action=1449]"));
    }

    private void enterCredentials(){
        sendKeysToElement(By.id("ember1432"), "John");
        sendKeysToElement(By.id("ember1435"), "John@gmail.com");
        sendKeysToElement(By.id("ember1438"), "12345");
        sendKeysToElement(By.id("ember1441"), "12345");
    }

    private void pressSigninAfterEnterCredentials(){
        clickElement(By.id("ember1492"));


    }

}
