package pages;


public class NewToursPage extends BasePage {

    HomePage homePage = new HomePage();

    public NewToursPage() {
    }

    public boolean isMainFragmentPresent() {
        return homePage.getRootElement().isDisplayed();
    }
}
