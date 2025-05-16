package main;

import org.junit.jupiter.api.Test;
import pages.FormPage;
import pages.MainPage;

public class Fullscreen_Test extends BaseSuite {

    @Override
    protected String getMode(){
        return "fullscreen";
    }

    @Test
    public void modalForm(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        new FormPage(driver)
                .fillingTheForm("lena","lenfu@eyc.tk")
                .submittedForm("lena","lenfu@eyc.tk");


    }

}
