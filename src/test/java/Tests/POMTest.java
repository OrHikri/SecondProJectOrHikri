package Tests;

import.Pages.HomePage;
import.Pages.Pickbusiness;
import.Pages.SenderAndReciverInfoScreen;
import Pages.HomePage;
import Pages.PickBusiness;
import Pages.SenderAndReciverInfoScreen;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class POMTest{
    public static WebDriver driver;
    private static ExtentReports extent;
    private static ExtentTest test;

    @BeforeClass
    public static void runOnceBeforeClass() {
        String cwd = System.getProperty("user.dir");
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(cwd + "\\extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        test = extent.createTest("MyFirstTest", "Sample description");

        test.log(Status.INFO, "@Before class");

        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\or_hi\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            test.log(Status.PASS, "Driver established successfully");
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Driver connection failed! " + e.getMessage());
            throw new Exception("Driver failed");
        }

        driver.get("https://buyme.co.il/");
    }

    @Test
    public void test01() {
        String NameElement = driver.findElement(By.id("ember1432")).getText();
        Assert.assertEquals("johon", NameElement);
        String EmailElement = driver.findElement(By.id("ember1435")).getText();
        Assert.assertEquals("John@gmail.com", EmailElement);
        String PasswordElement = driver.findElement(By.id("ember1438")).getText();
        Assert.assertEquals("12345", PasswordElement);
        String Password2Element = driver.findElement(By.id("ember1441")).getText();
        Assert.assertEquals("13245", Password2Element);
    }


    @Test
    public void test02(){
        HomePage  homePage = new HomePage(driver);

        try{
            homePage.PickPricePoint();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Pick Price Point was not clicked " + e.getMessage());
        }

        try{
            homePage.Pickregion();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Pick region was not clicked was not clicked " + e.getMessage());
        }

        try{
            homePage.PickCategory();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Pick Category was not clicked was not clicked " + e.getMessage());
        }

        try{
            homePage.FindMeAPresent();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Find Me A Present was not clicked was not clicked " + e.getMessage());
        }
    }

    @Test
    public void test03(){
        PickBusiness pickBuisness = new PickBusiness(driver);

        try{
            pickBuisness.AssertWebsiteURL();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Assert Website URL was not clicked was not same " + e.getMessage());
        }
        try{
            pickBuisness.PickBuisness();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Pick Buisness was not clicked was not clicked " + e.getMessage());
        }
        try{
            pickBuisness.EnterPrice();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Enter Price was not clicked was not Entered " + e.getMessage());
        }
        try{
            pickBuisness.PressToChoose();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Press To Choose was not clicked was not clicked " + e.getMessage());
        }
    }

    @Test
    public void test04() {
        SenderAndReciverInfoScreen senderAndReciverInfoScreen = new SenderAndReciverInfoScreen(driver);
        try{
            senderAndReciverInfoScreen.PressRadioButton();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Press Radio Button was not clicked was not clicked " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.EnterReceiverName();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Enter Receiver Name was not clicked was not Entered " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.PickAnEvent();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Pick An Event was not clicked was clicked " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.EnterABlessing();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Enter A Blessing was not clicked was Entered " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.UploadAPic();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Up load A Pic was not clicked was  not Up loaded " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.PressRadioButtonAfterPay();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Press Radio Button After Pay was not clicked was clicked " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.PickEmail();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Pick Email was not clicked " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.EnterEmail();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Enter Email was not  Entered " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.EnterSenderName();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Enter Sender Name was not clicked  " + e.getMessage());
        }

        try{
            senderAndReciverInfoScreen.PressSave();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Press Save was not clicked  " + e.getMessage());
        }

        String ReceiverNameElement = driver.findElement(By.xpath("//input[@id='ember2407']")).getText();
        Assert.assertEquals("Dan", ReceiverNameElement);
        String SenderNameElement = driver.findElement(By.xpath("//input[@placeholder='שם שולח המתנה']")).getText();
        Assert.assertEquals("John", SenderNameElement);
    }

        @AfterClass
    public static void tearDown() {
        driver.quit();
        extent.flush();
    }

    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath + ".png";
    }
}
