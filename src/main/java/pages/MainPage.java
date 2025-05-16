package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.bytebuddy.matcher.ElementMatchers.isEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.as;
import static org.junit.jupiter.api.Assertions.*;

public class MainPage extends AbsBasePage{
    public MainPage(WebDriver driver) {
        super(driver,"");
    }

    public void clickAllEntryButton(String textToEnter){
       WebElement inputField  = driver.findElement(By.id("textInput"));
                  inputField.sendKeys(textToEnter);

              String actualText = inputField.getAttribute("value");
              assertEquals(textToEnter,actualText, "текст в поле ввода не соответствует ожидаемому");

    }

    public void clickModalWindow() {
        WebElement modalWindow = driver.findElement(By.id("openModalBtn"));
        modalWindow.click();
    }

    public void ModalWindowVisible(){
       WebElement smallModalWindow = driver.findElement(By.cssSelector(".modal-content"));
               assertTrue(smallModalWindow.isDisplayed(), "модальное окно не отображается");
    }

    }
