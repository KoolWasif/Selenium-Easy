package com.seleniumeasy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumEasyTests {
    WebDriver driver;

    @BeforeClass
    public void initDriver()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
    }

    /**
     * first test method to test ping
     */
    @Test
    public void firstInitSeleniumEasyTests()
    {
      driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void closeBrowser() {driver.close();}

}

