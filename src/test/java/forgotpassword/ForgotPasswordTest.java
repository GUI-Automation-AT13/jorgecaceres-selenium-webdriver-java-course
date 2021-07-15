package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPassword;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void forgotPassMail(){
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        forgotPassword.enterEmail("gui@testing.com");
        EmailSentPage emailSentPage = forgotPassword.clickRetrievePassword();
        Assert.assertEquals(emailSentPage.getMessage(), "Internal Server Error", "Message is incorrect");

    }
}
