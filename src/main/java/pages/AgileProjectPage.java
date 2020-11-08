package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class AgileProjectPage {
    private SelenideElement logInput = $("input[name=uid]");
    private SelenideElement pasInput = $("input[name=password]");
    private SelenideElement loginBtn = $("input[name=btnLogin]");
    private SelenideElement Message = $("marquee.heading3");

    public boolean isWelcomeMessagePresent() {
        return Message.isDisplayed();
    }

    public void inputUserAndPass(String user, String pass) {
        logInput.val(user).click();
        pasInput.val(pass).click();
    }
    public void clickLoginButton() {
        loginBtn.click();
    }
}




