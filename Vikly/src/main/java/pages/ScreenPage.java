package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenPage extends ParentPage{

    public ScreenPage (WebDriver webDriver){
        super(webDriver);
    }
    public void TakeScreen () throws IOException {
        File screenshot = ((TakesScreenshot) webDriver).
                getScreenshotAs(OutputType.FILE);
        String path = "./target/screenshots/" + screenshot.getName();
        FileUtils.copyFile(screenshot, new File(path));
    }
}
