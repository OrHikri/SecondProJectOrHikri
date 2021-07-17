package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PickBusiness {
    private WebDriver driver;

    public PickBusiness(WebDriver driver){
        this.driver = driver;
    }

    public void AssertWebsiteURL(){
     String URl = "https://buyme.co.il/search?budget=1&category=204&region=13";
     Assert.assertEquals(URl, driver.getCurrentUrl());

    }

    public void PickBuisness(){
        driver.findElement(By.xpath("//li[@id='ember2135' and @class='ember-view bm-product-card-link mx-4 lr-6 sm-12']")).click();

    }

    public void EnterPrice(){
        driver.findElement(By.cssSelector("label[id=ember2300]")).sendKeys("88");


    }

    public void PressToChoose(){
        driver.findElement(By.cssSelector("button[gtm=בחירה]")).click();

    }
}
