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
public class AdminReportsTest {
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
    public void ResourcesPageShouldLoad() {
        driver.get(baseUrl);

//1. Verify title
        String j = driver.getTitle();
        System.out.println(j);
//2. Login
        driver.findElement(xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[5]/a/i")).click();
        //Enter usename
        driver.findElement(id("username")).sendKeys("icsa-am");
                //Enter password
        driver.findElement(id("password")).sendKeys("Chpl!234");
        driver.findElement(xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[5]/ul/li/div/form/button[1]")).click();
//3. Click link Developer & Product Management
        driver.findElement(linkText("Developer & Product Management")).click();
        driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[1]/div/ul/li[6]/a")).click();
//4. print title- certified product activity
        String k = driver.getTitle();
        System.out.println(k);

//4. developer activity
        driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[1]/div/ul/li[5]/a")).click();
        String d = driver.getTitle();
        System.out.println(d);

//5. Product activity
        driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[1]/div/ul/li[6]/a")).click();
        String p = driver.getTitle();
        System.out.println(p);
//6. ONC-ACB
        driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[1]/div/ul/li[7]/a")).click();
        String o = driver.getTitle();
        System.out.println(o);

//7. ATLs
        driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[1]/div/ul/li[8]/a")).click();
        String a = driver.getTitle();
        System.out.println(a);
//8. visitors

        driver.findElement(xpath("/html/body/div[2]/div/section/div[2]/div[1]/div/ul/li[9]/a")).click();
        String v = driver.getTitle();
        System.out.println(v);

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
