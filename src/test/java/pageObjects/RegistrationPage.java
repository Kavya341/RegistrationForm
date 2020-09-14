package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    By full_name = By.id("userName");
    By email = By.id("userEmail");
    By current_address = By.id("currentAddress");
    By permanent_address = By.id("permanentAddress");
    By submit = By.id("submit");
    // By name = By.id("name");

    public WebElement enterName(WebDriver driver) {
        return driver.findElement(full_name);
    }

    public WebElement enterEmail(WebDriver driver) {
        return driver.findElement(email);
    }

    public WebElement enterCurrentAddress(WebDriver driver) {
        return driver.findElement(current_address);
    }

    public WebElement enterPermanentAddress(WebDriver driver) {
        return driver.findElement(permanent_address);
    }

    public WebElement clickSubmit(WebDriver driver) {
        return driver.findElement(submit);
    }

}


