package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenshotUtils {

    public static String takeScreenshot(WebDriver driver, String testName) {

        String screenshotDir = System.getProperty("user.dir") + "/screenshots/";
        String screenshotPath = screenshotDir + testName + ".png";

        try {
            Files.createDirectories(Paths.get(screenshotDir));

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src.toPath(), Paths.get(screenshotPath));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return screenshotPath;
    }
}
