package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class Cookies {
    private WebDriver driver;

    public Cookies(WebDriver driver){
        this.driver = driver;
    }
    public void addCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(Cookie cookie){
        driver.manage().deleteCookie(cookie);
    }

    public boolean isCookiePresent(Cookie cookie){
        return driver.manage().getCookieNamed(cookie.getName()) != null;
    }

    public Cookie setCookie(String name, String value){
        Cookie cookie = new Cookie.Builder(name, value)
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
        return cookie;
    }
}
