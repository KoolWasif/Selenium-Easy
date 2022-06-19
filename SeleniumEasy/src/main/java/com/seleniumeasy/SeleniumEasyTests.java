package com.seleniumeasy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SeleniumEasyTests {
    WebDriver driver;
    Element element ;
    Element.element xpath = Element.element.XPath;
    Element.element id = Element.element.Id;

    @BeforeSuite
    public void initDriver()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        element = new Element(driver);
    }
    @BeforeTest
    public void BeforeTest()
    {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * first test method to test ping
     */
    @Test
    public void firstInitSeleniumEasyTests()
    {
      driver.get("https://the-internet.herokuapp.com/");
    }

    /**
     * the below test will demonstrate how we can use emums
     * We have declared an Element to specify element attributes like id , xpath or class names etc.
     */
    @Test
    public void elementEnumTest()
    {

        element.click(xpath, "//a[contains(text(),'Form Authentication')]");
        element.shortWait();
        Assert.assertTrue(element.isDisplayed(xpath, "//button[@type='submit']"));
    }

    @AfterClass
    public void closeBrowser() {driver.close();}

}

