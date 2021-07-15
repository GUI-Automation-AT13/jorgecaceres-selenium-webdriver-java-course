package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public ForgotPassword clickForgotPassword() {
        clickCssSelector("a[href='/forgot_password']");
        return new ForgotPassword(driver);
    }

    public HorizontalSlider clickHorizontalSlider() {
        clickCssSelector("a[href='/horizontal_slider']");
        return new HorizontalSlider(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenu clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenu(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }


    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    public Frames clickFrames(){
        clickLink("Frames");
        return new Frames(driver);
    }


    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    private void clickCssSelector(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    private void clickXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    private void clickId(String id) {
        driver.findElement(By.id(id)).click();
    }

    private void clickClassName(String className) {
        driver.findElement(By.className(className)).click();
    }

}