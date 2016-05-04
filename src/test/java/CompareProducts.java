/**
 * Created by amore on 2/17/2016.
 */
import com.appsenseca.pageobjects.SearchPgae;
import com.appsenseca.util.WebUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static junit.framework.TestCase.assertTrue;
import static org.openqa.selenium.By.*;

/**
 * Created by amore on 2/16/2016.
 */
public class CompareProducts {
    private WebDriver driver;
    private String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        // driver.manage().window().maximize();
        baseUrl = "https://staging.opendatachpl.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    }


