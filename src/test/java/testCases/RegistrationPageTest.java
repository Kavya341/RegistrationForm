package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.RegistrationPage;

public class RegistrationPageTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        RegistrationPage page = new RegistrationPage(driver);

        page.enterName(driver).sendKeys("Test");
        page.enterEmail(driver).sendKeys("Test@gmail.com");
        page.enterCurrentAddress(driver).sendKeys("Some address...");
        page.enterPermanentAddress(driver).sendKeys("Some address again");
        page.clickSubmit(driver).submit();

        driver.quit();

    }

}
