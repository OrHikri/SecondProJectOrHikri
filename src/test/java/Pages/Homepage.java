package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void PickPricePoint(){
        driver.findElement(By.cssSelector("div[title id=ember985_chosen]")).click();
        driver.findElement(By.partialLinkText("עד 99")).click();
    }

    public void Pickregion(){
        driver.findElement(By.cssSelector("div[title id=ember1000_chosen]")).click();
        driver.findElement(By.partialLinkText("מרכז")).click();
    }

    public void PickCategory(){
        driver.findElement(By.cssSelector("div[title id=ember1010_chosen]")).click();
        driver.findElement(By.partialLinkText("מתנות עד הבית")).click();
    }

    public void FindMeAPresent(){
        driver.findElement(By.xpath("//[@id='ember1045' and @rel='nofollow']")).click();

    }
}