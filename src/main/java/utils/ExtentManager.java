package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    public static ExtentReports createInstance() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-YYYY HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("src/main/resources/reports/" + dtf.format(now) + ".html");

        extent = new ExtentReports();
        extent.attachReporter(extentSparkReporter);

        return extent;
    }
}
