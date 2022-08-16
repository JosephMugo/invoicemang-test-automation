package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {

    private WebDriver driver;
    private HomePage homePage;
    private String homePageUrl = "http://localhost:3000/home";

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
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
