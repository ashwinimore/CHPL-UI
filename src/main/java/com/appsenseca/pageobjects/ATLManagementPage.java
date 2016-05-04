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
public class ATLManagementPage {

    private static WebElement element = null;

    public static WebElement ATL_Management_Link(WebDriver driver){
        element =  driver.findElement(linkText("ATL Management"));
        element.click();
        return element;
    }


    public static WebElement UserLoginNavigationLink(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[5]/a/i"));
        element.click();
        return element;
    }

    public static WebElement EnterUsername(WebDriver driver){
        element =  driver.findElement(id("username"));
        element.sendKeys("admin");
        return element;
    }

    public static WebElement EnterPassword(WebDriver driver){
        element =   driver.findElement(id("password"));
        element.sendKeys("admin");
        return element;
    }
    public static WebElement ClickLoginButton(WebDriver driver){
        element =   driver.findElement(xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[5]/ul/li/div/form/button[1]"));
        element.click();
        return element;
    }

    public static WebElement LogintoAdminAccount(WebDriver driver){
        ATLManagementPage.UserLoginNavigationLink(driver);
        ATLManagementPage.EnterUsername(driver);
        ATLManagementPage.EnterPassword(driver);
        ATLManagementPage.ClickLoginButton(driver);
        return element;
    }


    public static WebElement EditATLform(WebDriver driver){
        element =   driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[2]/div/button"));
        element.click();
        return element;
    }
    public static WebElement verifyEditATLformLabel(WebDriver driver){
        element =   driver.findElement(id("Edit ATL"));
        return element;
    }
    public static WebElement cancelEditATLform(WebDriver driver){
        element =   driver.findElement(xpath("/html/body/div[5]/div/div/div/div[3]/span/button[2]"));
        return element;
    }
    public static WebElement confirmCancelEditATLform(WebDriver driver){
        element =   driver.findElement(xpath("/html/body/div[6]/div/div/div[3]/button[1]"));
        return element;
    }


}


