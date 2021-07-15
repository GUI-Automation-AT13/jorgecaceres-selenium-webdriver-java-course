package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {
    private WebDriver driver;

    public Frames(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFrames clickNestedFrames() {
        driver.findElement(By.linkText("Nested Frames")).click();
        return new NestedFrames(driver);
    }
}
