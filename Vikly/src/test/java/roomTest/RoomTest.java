package roomTest;

import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;

public class RoomTest extends ParentTest {

    @Test
    public void Zakaz() throws InterruptedException, IOException {
        homePage.openPage();
        roomPage.clicklZaezd();
        roomPage.clickDataZaezd();
        roomPage.clickDataVyezda();
        roomPage.clickRoom();
        roomPage.clickVzroslye();
        roomPage.clickBaby();
        roomPage.clickBaby();
        roomPage.clickVozrost();
        roomPage.clickFirstbaby();
        roomPage.clickSecondbaby();
        roomPage.clickPosmotret();
        roomPage.clickBron();
        screenPage.TakeScreen1();
    }
}
