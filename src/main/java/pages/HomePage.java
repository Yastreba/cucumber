package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {

    protected SelenideElement rootElement = $("div[class='row']");
    private SelenideElement agileProjectLink = $x("//a[contains(text(), 'Agile Project')]");
    private SelenideElement newToursLink = $x("//a[contains(text(), 'New Tours')]");
    private SelenideElement seleniumDropdown = $x("//a[@class='dropdown-toggle' and contains(text(), 'Selenium')]");
    private SelenideElement fileUploadLink = $x("//a[contains(text(), 'File Upload')]");
    private SelenideElement dragAndDropLink = $x("//a[contains(text(), 'Drag and Drop Action')]");
    private SelenideElement tableDemoLink = $x("//a[contains(text(), 'Table Demo')]");
    private SelenideElement loginForm = $("form[name='frmLogin']");

    public HomePage() {
    }

    public boolean isLoginFormPresent() {
        return loginForm.isDisplayed();
    }

    public void navigate() {
        open("/");
    }

    public SelenideElement getRootElement() {
        return rootElement;
    }

    private void clickSeleniumSelector() {
        seleniumDropdown.click();
    }

    public void clickAgileProjectLink() {
        agileProjectLink.click();
    }

    public void clickNewToursLink() {
        newToursLink.click();
    }

    public void clickFileUploadLink() {
        clickSeleniumSelector();
        fileUploadLink.click();
    }

    public void clickDragAndDropLink() {
        clickSeleniumSelector();
        dragAndDropLink.click();
    }

    public void clickTableDemo() {
        clickSeleniumSelector();
        tableDemoLink.click();
    }
}


