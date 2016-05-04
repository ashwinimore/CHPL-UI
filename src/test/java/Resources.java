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
public class Resources {
    private WebDriver driver;
    private String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        // driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/amore/IdeaProjects/CHPL-UI/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        baseUrl = "https://chpl.ahrqstg.org/#/resources";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void ResourcesPageShouldLoad() {

//1. Verify title
        String j = driver.getTitle();
        System.out.println(j);

// 2. Click download button
        driver.findElements(By.partialLinkText("/rest/download?api_key=12909a978483dfb8ecd0596c98ae9094"));

//3.  verify file download succeeds
//4.  verify text

        boolean k = driver.getPageSource().contains("Access API Documentation");
        System.out.println(k);



//5. Enter Name to register
driver.findElements(By.id("userName"));
//6. Enter email
        driver.findElement(By.id("email"));
//7. Click register
        driver.findElement(By.xpath("/*[@id=\"mainContent\"]/div[2]/div/div/div/div/div/button"));
//8. verify key generated  or email received

//9. Click link activity controller
        driver.findElement(By.xpath("/*[@id=\"mainContent\"]/div[3]/div/div[2]/div/ul/li[1]/div/ul[1]/li/h4/a"));
//10. Click /activity/acbs link
driver.findElement(By.xpath("/*[@id=\"mainContent\"]/div[3]/div/div[2]/div/ul/li[1]/ul/li[1]/div[1]/a/div/span[2]"));
//11. verify text response class (status 200)
        driver.getPageSource().contains("response class (status 200)");
//12. open/hide
        driver.findElement(By.partialLinkText("open/hide"));

// 13. list operations
        driver.findElement(By.partialLinkText("list operations"));
// 14. expand operations
        driver.findElement(By.partialLinkText("expand operations"));
    }


}
