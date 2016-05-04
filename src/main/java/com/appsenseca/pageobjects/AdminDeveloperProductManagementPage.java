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
public class AdminDeveloperProductManagementPage {
    private static WebElement element = null;

    public static WebElement DeveloperProductManagement_Link(WebDriver driver){
        element =  driver.findElement(linkText("Developer & Product Management"));
        element.click();
        return element;
    }


    public static WebElement ShowDeveloperCodes(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[3]/div[2]/div/button"));
        element.click();
        return element;
    }

    public static WebElement SelectaDeveloper(WebDriver driver){
        element =  driver.findElement(id("developerSelect"));
        element.click();
        return element;
    }
    public static WebElement SelectaDevelopertestcase(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[3]/div[1]/div/div/div/div[2]/select/option[2]"));
        element.click();
        return element;
    }
    public static WebElement ClickChooseDeveloperButton(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[3]/div[1]/div/div/div/div[3]/button"));
        element.click();
        return element;
    }
    public static WebElement SelectaProduct(WebDriver driver){
        element =  driver.findElement(id("productSelect"));
        element.click();
        return element;
    }
    public static WebElement SelectaProducttestcase(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[3]/div[3]/div/div/div/div[2]/select/option[19]"));
        element.click();
        return element;
    }


    public static WebElement ClickChooseProduct(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[3]/div[3]/div/div/div/div[3]/button"));
        element.click();
        return element;
    }
    public static WebElement SelectaVersion(WebDriver driver){
        element =  driver.findElement(id("versionSelect"));
        element.click();
        return element;
    }


    public static WebElement SelectaVersiontestcase(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[3]/div[4]/div/div/div/div[2]/select/option[2]"));
        element.click();
        return element;
    }


    public static WebElement ClickChooseVersion(WebDriver driver){
        element =  driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[2]/section/div/div[3]/div[4]/div/div/div/div[3]/button"));
        element.click();
        return element;
    }








}
