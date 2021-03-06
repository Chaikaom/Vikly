package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionWithOurElements {
    WebDriver webDriver;
   Logger logger;
    WebDriverWait webDriverWait15;

    public ActionWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webDriverWait15 = new WebDriverWait(webDriver, 15);
    }
    public void clickOnElement(WebElement webElement){
        try {
            webDriverWait15.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
          logger.info("Element was clicked");
        }catch  (Exception e) {
            printErroeStopTest();
        }
    }
    public void printErroeStopTest() {
        logger.error("Can not element");
        Assert.fail("Can not element");
    }
}
