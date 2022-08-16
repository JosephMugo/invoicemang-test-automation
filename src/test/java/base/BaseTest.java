package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.HomePage;
import utils.ApplicationWebDriverListener;
import utils.ExtentManager;

@Listeners(ApplicationWebDriverListener.class)
public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    private String homePageUrl = "http://localhost:3000/home";


    @BeforeSuite
    public void setupSuite() {
        ExtentManager.createInstance();
    }

    @BeforeClass
    public void setup(ITestContext context) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        context.setAttribute("WebDriver", driver);

        goHome();

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get(homePageUrl);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
