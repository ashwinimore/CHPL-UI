package com.appsenseca.util;

import com.appsenseca.pageobjects.SearchPgae;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amore on 2/22/2016.
 */
public class WebUtil {

    public static SearchPgae goToSearchPage(WebDriver driver) {

        driver.get("https://staging.opendatachpl.org");
        return PageFactory.initElements(driver, SearchPgae.class);
    }
}
