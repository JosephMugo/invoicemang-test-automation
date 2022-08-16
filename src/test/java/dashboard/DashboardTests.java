package dashboard;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class DashboardTests extends BaseTest {

    @Test
    public void navigatesToDashboard() {
        DashboardPage dashboardPage = homePage.clickExploreButton();
        Assert.assertEquals(dashboardPage.getDashboardTitle(), "Invoices", "Text does not match");
    }
}
