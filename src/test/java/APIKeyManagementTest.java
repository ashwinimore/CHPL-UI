import com.appsenseca.pageobjects.ResourcesPage;
import com.appsenseca.pageobjects.SearchPgae;
import com.appsenseca.util.WebUtil;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static junit.framework.TestCase.assertTrue;
import static org.openqa.selenium.By.*;

public class APIKeyManagementTest {
    private WebDriver driver;
    private String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        // driver.manage().window().maximize();
        baseUrl = "https://chpl.ahrqdev.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void ResourcesPageShouldLoad() {

//2. Login
        driver.findElement(xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[5]/a/i")).click();
        //Enter usename
        driver.findElement(id("username")).sendKeys("admin");
        //Enter password
        driver.findElement(id("password")).sendKeys("admin");

        driver.get("https://chpl.ahrqstg.org/#/resources");
        ResourcesPage.enter_name(driver);
        ResourcesPage.enter_email(driver);
        ResourcesPage.click_register_button(driver);


        ResourcesPage.API_key_management_link(driver);
//verify key





        driver.findElement(linkText("API Key Management")).click();


    }

}
