package main;

import org.junit.jupiter.api.Test;
import pages.MainPage;

public class Kiosk_Test extends BaseSuite {

    @Override
    protected String getMode() {
        return "kiosk";
    }
    @Test
    public void openModalWindow(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickModalWindow();
        mainPage.ModalWindowVisible();
    }
}
