package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomPage extends ParentPage {

    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[1]/div[3]/div[1]/div/span/span[2]")
    private WebElement zaezd;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[2]/div[2]/table[2]/tbody/tr[4]/td[4]/div")
    private WebElement datazaezda;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[2]/div[2]/table[2]/tbody/tr[4]/td[5]/div")
    private WebElement datavyezda;
    @FindBy(css = "#container > div > div > div > div.h-page__check-avail > form > div.check-form-wrapper.clearfix > div.get-price > div > div._btn-check-wrapper > button.basic-btn.__btn-check.hide-tablet.js-change.js-check-avail-pop.js-get-price-btn.js-gtm-check-avail-btn")
    private WebElement posmotret;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[1]/div[3]/div[3]/div[1]/span")
    private WebElement room;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/div[3]")
    private WebElement vzroslye;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[3]")
    private WebElement baby;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/select")
    private WebElement vozrost;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/select[1]/option[4]")
    private WebElement firstbaby;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div[5]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/select[2]/option[12]")
    private WebElement secondbaby;
    @FindBy(xpath = "//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[2]/div/div[3]/div/div/div/a")
    private WebElement bron;
    @FindBy(xpath = "//*[@id=\"hcta\"]/span[1]")
    private WebElement zabron;

    public RoomPage(WebDriver webDriver){
        super(webDriver);
    }

    public void clicklZaezd(){
        actionWithOurElements.clickOnElement(zaezd);
    }
    public void clickDataZaezd() {
        actionWithOurElements.clickOnElement(datazaezda);
    }
    public void clickDataVyezda() {
        actionWithOurElements.clickOnElement(datavyezda);
    }
    public void clickPosmotret(){
        actionWithOurElements.clickOnElement(posmotret);
    }
    public void clickRoom(){
        actionWithOurElements.clickOnElement(room);
    }
    public void clickVzroslye(){
        actionWithOurElements.clickOnElement(vzroslye);
    }
    public void clickBaby() {
        actionWithOurElements.clickOnElement(baby);
    }
    public void clickVozrost(){
        actionWithOurElements.clickOnElement(vozrost);
    }
    public void clickFirstbaby(){
        actionWithOurElements.clickOnElement(firstbaby);
    }
    public void clickSecondbaby(){
        actionWithOurElements.clickOnElement(secondbaby);
    }
    public void clickBron() throws InterruptedException{
        Thread.sleep(2000);
        actionWithOurElements.clickOnElement(bron);
    }
    public void clickZabron() {
        actionWithOurElements.clickOnElement(zabron);
    }
}
