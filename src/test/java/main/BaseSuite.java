package main;

import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseSuite {
    protected WebDriver driver = null;
    protected abstract String getMode();

    @BeforeEach
    public void init() {
        System.setProperty("mode", getMode());
        driver = new WebDriverFactory().getDriver();

    }

    @AfterEach
    public void close() {
        if (driver !=null) {
            driver.quit();
        }
        }

    }

