package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormPage extends AbsBasePage {

    public FormPage(WebDriver driver) {
        super(driver, "");
    }

    public FormPage fillingTheForm(String name, String email){
        WebElement fieldName = driver.findElement(By.id("name"));
        fieldName.sendKeys(name);

        WebElement fieldEmail = driver.findElement(By.id("email"));
        fieldEmail.sendKeys(email);

        WebElement fieldButton = driver.findElement(By.cssSelector("button[type=submit]"));
        fieldButton.click();

        return this;
    }

    public void submittedForm(String expectedName, String expectedEmail){
        WebElement result = driver.findElement(By.id("messageBox"));
        String expected = "Форма отправлена с именем: " + expectedName + " и email: " + expectedEmail;


        assertTrue(result.isDisplayed(), "Сообщение не отображается");
        assertEquals(expected,result.getText(),"Введенный текст не совпадает");

    }



}
