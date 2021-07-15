package nestedframe;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Frames;
import pages.NestedFrames;

public class NestedFrameTest extends BaseTests {
    @Test
    public void testFrames(){
        Frames frames = homePage.clickFrames();
        NestedFrames nestedFrames = frames.clickNestedFrames();
        String actualLeft = nestedFrames.getLeftFrameText();
        Assert.assertEquals(actualLeft,"LEFT");
        String actualBottom = nestedFrames.getBottomFrameText();
        Assert.assertEquals(actualBottom,"BOTTOM");
    }
}
