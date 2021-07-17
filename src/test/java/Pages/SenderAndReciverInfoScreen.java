package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SenderAndReciverInfoScreen {
    private WebDriver driver;

    public SenderAndReciverInfoScreen(WebDriver driver) {
        this.driver = driver;
    }

    public void PressRadioButton() {
        driver.findElement(By.cssSelector("div[gtm=למישהו אחר]")).click();
    }

    public void EnterReceiverName() {
        driver.findElement(By.xpath("//input[@id='ember2407']")).sendKeys("Dan");
    }

    public void PickAnEvent() {
        driver.findElement(By.cssSelector("div[class=selected-name]")).click();
        driver.findElement(By.partialLinkText("מתנות סוף שנה")).click();
    }

    public void EnterABlessing() {
        driver.findElement(By.xpath("//textarea[@rows='4' and @data-parsley-id='47']")).sendKeys("Thanks");
    }

    public void UploadAPic() {
        driver.findElement(By.cssSelector("label[id=ember2577]")).sendKeys("<C:\\Users\\or_hi\\OneDrive\\שולחן העבודה>");
    }

    public void PressRadioButtonAfterPay() {
        driver.findElement(By.cssSelector("button[gtm=המשך]")).click();
    }

    public void PickEmail() {
        driver.findElement(By.cssSelector("svg[gtm=method-email]")).click();
    }

    public void EnterEmail() {
        driver.findElement(By.cssSelector("input[placeholder=מייל מקבל/ת המתנה]")).sendKeys("Dan@gmail.com");
    }

    public void EnterSenderName() {
        driver.findElement(By.xpath("//input[@placeholder='שם שולח המתנה']")).sendKeys("John");
    }

    public void PressSave() {
        driver.findElement(By.cssSelector("button[id=ember2688]")).click();
    }
}