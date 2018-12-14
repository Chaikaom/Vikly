package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    @FindBy(css = "#container > div > div > div > div.h-page__navigation.basic-white-blank > ul > li.nav-item.js-gtm-nav-item-overview > a")
    private WebElement opisanie;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[7]/div[3]/div[1]/div/div/ul/li[2]/a")
    private WebElement udobstva;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[7]/div[3]/div[1]/div/div/ul/li[3]/a")
    private WebElement nomera;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[7]/div[3]/div[1]/div/div/ul/li[4]/a")
    private WebElement raspolojenie;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[7]/div[3]/div[1]/div/div/ul/li[5]/a")
    private WebElement otzyvy;

    public HomePage(WebDriver webDriver){
        super(webDriver);
    }
    public void openPage()  {
        try {
            webDriver.get("http://knickerbocker-hotel-new-york.nochi.com/?btest=119");
            logger.info("HomePage was opened");
        } catch (Exception e) {
            logger.error("Can not open HomePage");
            Assert.fail("Can not open HomePage");
        }
    }
    public void click1() {
        actionWithOurElements.clickOnElement(opisanie);
    }
    public void click2() { actionWithOurElements.clickOnElement(udobstva); }
    public void click3() {
        actionWithOurElements.clickOnElement(nomera);
    }
    public void click4() {
        actionWithOurElements.clickOnElement(raspolojenie);
    }
    public void click5() {
        actionWithOurElements.clickOnElement(otzyvy);
    }
}
