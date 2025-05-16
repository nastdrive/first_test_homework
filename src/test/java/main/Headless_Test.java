package main;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class Headless_Test extends BaseSuite {

    @Override
    protected String getMode(){
        return "headless";
    }

    @Test
    public void openThePageEnterText () {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAllEntryButton("ОТУС");
    }

}
