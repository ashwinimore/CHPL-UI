import com.appsenseca.pageobjects.SearchPgae;
import com.appsenseca.util.WebUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amore on 4/25/2016.
 */
public class OverviewPageContent {
    private WebDriver driver;
    private String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
       // driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/amore/IdeaProjects/CHPL-UI/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        baseUrl = "https://chpl.ahrqstg.org/#/overview";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void OverviewPageContentshouldbeValid() {
        // go to CHPL staging


//1. verify page title after page load
        String j = driver.getTitle();
        System.out.println(j);

//2. Verify text on page
        boolean k = driver.getPageSource().contains("ONC-ACB and ATL information");
        System.out.println(k);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}

