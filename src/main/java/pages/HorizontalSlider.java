package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {

    private WebDriver driver;
    private By sliderValue = By.id("range");
    private By slider = By.cssSelector(".sliderContainer input");

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }

    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }
    public void setSliderValue(String value){
        while(!getSliderValue().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
