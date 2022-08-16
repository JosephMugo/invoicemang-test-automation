package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;
    private By title = By.id("title");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDashboardTitle() {
        return driver.findElement(title).getText();
    }
}
