package pages;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public class WindowsPage extends  ParentPage{
    public WindowsPage(WebDriver webDriver){
        super(webDriver);
    }
    public void SwitchWindows()throws InterruptedException{
        Thread.sleep(3000);
        ArrayList tabs2 = new ArrayList(webDriver.getWindowHandles());
        webDriver.switchTo().window((String) tabs2.get(1));
        webDriver.switchTo().window((String) tabs2.get(0));
    }
    public void SwitchWindows1()throws InterruptedException{
        Thread.sleep(3000);
        ArrayList tabs2 = new ArrayList(webDriver.getWindowHandles());
        webDriver.switchTo().window((String) tabs2.get(1));
        webDriver.switchTo().window((String) tabs2.get(0));
        webDriver.switchTo().window((String) tabs2.get(2));
    }
}
