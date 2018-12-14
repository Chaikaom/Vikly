package pages;

import javafx.scene.control.Tab;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class WindowsPage extends  ParentPage{

    public WindowsPage(WebDriver webDriver){
        super(webDriver);
    }
    public void NewWindows() throws InterruptedException{
        Thread.sleep(3000);
        Actions action =new Actions(webDriver);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
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
