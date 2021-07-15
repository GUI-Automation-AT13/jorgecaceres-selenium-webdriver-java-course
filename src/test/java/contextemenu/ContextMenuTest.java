package contextemenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenu;

public class ContextMenuTest extends BaseTests {

    @Test
    public void contextMenuRightClickTest(){
        ContextMenu contextMenu = homePage.clickContextMenu();
        contextMenu.rightClickBox();
        String popUpMessage = contextMenu.getPopUpText();
        Assert.assertEquals(popUpMessage,"You selected a context menu");
        contextMenu.acceptPopUp();
    }
}
