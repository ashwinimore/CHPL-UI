import com.appsenseca.pageobjects.AdminDeveloperProductManagementPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.appsenseca.pageobjects.ATLManagementPage;
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

public class AdminDeveloperProductManagementTest {

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
    public void DeveloperProductManagement() {
        driver.get(baseUrl);
        ATLManagementPage.LogintoAdminAccount(driver);
        AdminDeveloperProductManagementPage.DeveloperProductManagement_Link(driver);
        AdminDeveloperProductManagementPage.ShowDeveloperCodes(driver);
        //add test cases to verify column headers and codes
        AdminDeveloperProductManagementPage.ShowDeveloperCodes(driver);
AdminDeveloperProductManagementPage.SelectaDeveloper(driver);
        AdminDeveloperProductManagementPage.SelectaDevelopertestcase(driver);
        //Add test cases for -Edit Developer
        AdminDeveloperProductManagementPage.ClickChooseDeveloperButton(driver);

        AdminDeveloperProductManagementPage.SelectaProduct(driver);
        AdminDeveloperProductManagementPage.SelectaProducttestcase(driver);
        //Add test cases for - Edit Product
        AdminDeveloperProductManagementPage.ClickChooseProduct(driver);
AdminDeveloperProductManagementPage.SelectaVersion(driver);
        AdminDeveloperProductManagementPage.SelectaVersiontestcase(driver);
        //Add test cases for - Edit Version

        //Add test cases for - select product
        //Add test cases for - edit edit CP
        //Add test cases for merge developers and products - merge developers, merge products, merge versions
    }
}