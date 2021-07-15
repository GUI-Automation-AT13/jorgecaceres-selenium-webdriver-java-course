package cookie;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Cookies;

public class CookiesTest extends BaseTests {

    @Test
    public void cookieTest(){
        Cookies cookies = getCookie();
        Cookie cookie = cookies.setCookie("deletableCookie","123");
        cookies.deleteCookie(cookie);
        boolean result = cookies.isCookiePresent(cookie);
        Assert.assertFalse(result);
    }
}
