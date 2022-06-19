package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element {
    public WebDriver driver;

public Element(WebDriver driver)
{
    this.driver=driver;
}
        public enum element
        {
            Id,
            Class,
            CSS,
            XPath,

        }

        public WebElement findElement(element element , String value)
        {
            switch (element ){
                case Id:
                    //System.out.println(element.Id);
                    return driver.findElement(By.id(value));
                case Class:
                    //System.out.println(element.Class);
                    return driver.findElement(By.className(value));
                case CSS:
                    //System.out.println(element.Class);
                    return driver.findElement(By.cssSelector(value));
                case XPath:
                    return  driver.findElement(By.xpath(value));
                default:
                    return null;
            }
    }
     public void click(element  element, String value )
        {
            findElement(element , value).click();
        }

     public boolean isDisplayed(element element , String value)
     {
        if(findElement(element, value).isDisplayed()) return true;
        else return false;
     }

     public void shortWait()
     {
         try {new Thread().sleep(5000);}
         catch (InterruptedException IException) {}
     }
}



