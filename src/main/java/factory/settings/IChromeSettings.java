package factory.settings;

import org.openqa.selenium.remote.AbstractDriverOptions;

public interface IChromeSettings {
    AbstractDriverOptions settings = null;
    AbstractDriverOptions settings();
}
