package factory;

import exception.BrowserNotSupportedExpection;
import factory.settings.ChromeSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
    private String browserName = System.getProperty("browser");
    private String modeBrowser = System.getProperty("mode", "default");

    public WebDriver getDriver() {
        switch (browserName.toLowerCase()) {
            case "chrome" : {
                ChromeOptions options = new ChromeOptions();

                switch (modeBrowser.toLowerCase()) {
                    case "headless" :
                        options.addArguments("--headless");
                        break;
                    case "kiosk" :
                        options.addArguments("--kiosk");
                        break;
                    case "fullscreen" :
                        options.addArguments("--fullscreen");
                        break;

                    default:
                        options.addArguments("--maximized");
                }
                return new ChromeDriver(options);
            }
        }
        throw new BrowserNotSupportedExpection(browserName);
    }
}
