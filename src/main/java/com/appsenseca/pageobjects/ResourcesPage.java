package com.appsenseca.pageobjects;
import com.appsenseca.pageobjects.SearchPgae;
import com.appsenseca.util.WebUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

public class ResourcesPage {
    private static WebElement element = null;

    public static WebElement Developer_product_management_link(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[5]/a/i"));
        element.click();
       return element;
    }

    public static WebElement API_key_management_link(WebDriver driver){
        element =  driver.findElement(linkText("API Key Management"));
        element.click();
        return element;
    }
    public static WebElement enter_name(WebDriver driver){
        element =  driver.findElement(By.id("userName"));
        element.sendKeys("Ashwini");
        return element;
    }

    public static WebElement enter_email(WebDriver driver){
        element =  driver.findElement(By.id("email"));
        element.sendKeys("amore@ainq.com");
        return element;
    }
    public static WebElement click_register_button(WebDriver driver){
        element =  driver.findElement(By.xpath("/*[@id=\"mainContent\"]/div[2]/div/div/div/div/div/button"));
        element.click();
        return element;
    }



}
