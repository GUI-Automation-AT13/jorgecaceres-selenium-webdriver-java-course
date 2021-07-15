package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
    @Test
    public void testWaitUntilVisible(){
        DynamicLoadingPage dynamicLoading = homePage.clickDynamicLoading();
        DynamicLoadingExample2Page loadingExample2Page = dynamicLoading.clickExample2();
        loadingExample2Page.clickStart();
        String actual = loadingExample2Page.getLoadedText();
        Assert.assertEquals(actual,"Hello World!");
    }
    @Test
    public void rightClickToNewTab(){
        DynamicLoadingPage dynamicLoading = homePage.clickDynamicLoading();
        DynamicLoadingExample2Page loadingExample2Page = dynamicLoading.rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        String actual = loadingExample2Page.getStartText();
        Assert.assertEquals(actual,"Start");
    }
}
