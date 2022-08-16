package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By exploreBtn = By.xpath("//button[text()='Explore']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DashboardPage clickExploreButton() {
        driver.findElement(exploreBtn).click();
        return new DashboardPage(driver);
    }
}
