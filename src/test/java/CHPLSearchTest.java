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
 * Created by amore on 2/2/2016.
 */
public class CHPLSearchTest {
    private WebDriver driver;
    private String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
       // driver.manage().window().maximize();
        baseUrl = "https://chpl.ahrqstg.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void searchshouldbesuccessful(){
        // go to CHPL staging

        //1. SearchPage
        SearchPgae SearchPage = WebUtil.goToSearchPage(driver);
           driver.get(baseUrl);

//1. verify page title after page load
        String j = driver.getTitle();
        System.out.println(j);
//2. Search all
        WebElement searchButton = driver.findElement(xpath("/html/body/div[2]/div/div/div/div/div/div/span/button"));
        searchButton.click();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(partialLinkText("Details")));
       // Assert.assertTrue("Product Details Should Exist for results", driver.findElements(By.partialLinkText("details")).size() >0);
//3. Clear results
        WebElement clearResults = driver.findElement(By.linkText("Clear results"));
        clearResults.click();
// 4. Enter Search Criteria
        WebElement searchTextbox = driver.findElement(id("searchField"));
        searchTextbox.clear();
        searchTextbox.sendKeys("AllMeds, Inc.");

        searchButton.click();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
//5. verify search results are returned.

     boolean text = driver.getPageSource().contains("results found");
         System.out.println(text);

       // String bodyText1 =  driver.findElement(By.tagName("body")).getText();
       //Assert.assertTrue("Text not found!", bodyText1.contains("results found"));
       // System.out.println(bodyText1);
        //Click search button

        //6. verify results

        //7. Add refine search tests
        //8. Test browse all feature
    }
@After
    public void tearDown(){
    driver.quit();
}
}
