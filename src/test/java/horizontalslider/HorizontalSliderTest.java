package horizontalslider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        Assert.assertEquals(sliderPage.getSliderValue(), value);
    }
}
