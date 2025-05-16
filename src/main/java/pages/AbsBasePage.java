package pages;

import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AbsBasePage {
    protected WebDriver driver = null;
    private String path = "";

    public AbsBasePage(WebDriver driver,String path){
        this.driver = driver;
        this.path = path;
    }

    private String baseUrl = System.getProperty("base.url");

    public void open(){
        driver.get(baseUrl + path);

    }


}
