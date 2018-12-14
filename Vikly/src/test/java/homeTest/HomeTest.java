package homeTest;

import org.junit.Test;
import parentTest.ParentTest;
import java.io.IOException;

public class HomeTest extends ParentTest {
    @Test
    public void validAuth() throws  IOException {
      homePage.openPage();
      screenPage.TakeScreen();
        homePage.click1();
        screenPage.TakeScreen();
        homePage.click2();
        screenPage.TakeScreen();
        homePage.click3();
        screenPage.TakeScreen();
        homePage.click4();
        screenPage.TakeScreen();
        homePage.click5();
        screenPage.TakeScreen();
    }

}
