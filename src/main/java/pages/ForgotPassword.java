package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPassword {
    private WebDriver driver;
    private By emailField = By.cssSelector("#email");
    private By retrievePasswordButton = By.cssSelector("#form_submit");
    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrievePassword(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);
    }
}
