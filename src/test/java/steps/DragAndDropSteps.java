package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DragAndDropPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DragAndDropSteps {
    HomePage homePage = new HomePage();
    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Given("user is on dragAndDrop page")
    public void userIsOnDragAndDropPage() {
        homePage.navigate();
        homePage.clickDragAndDropLink();

    }

    @And("success message is not shown")
    public void successMessageIsNotShown() {
        dragAndDropPage.getPerfectMessage().shouldNotBe(Condition.exist);
    }

    @When("user drop debit account {string}")
    public void userDropDebitAccount(String text) {
        assertEquals(text, dragAndDropPage.getBank().getText());
        dragAndDropPage.bankToDebitAccount();
    }

    @And("user drop debit amount {string}")
    public void userDropDebitAmount(String text) {
        assertEquals(text, dragAndDropPage.getFiveThousands().getText());
        dragAndDropPage.fiveThousandToDebitAmount();
    }

    @And("user drop credit account {string}")
    public void userDropCreditAccount(String text) {
        assertEquals(text, dragAndDropPage.getSales().getText());
        dragAndDropPage.salesToCraditAccount();
    }

    @And("user drop credit amount {string}")
    public void userDropCreditAmount(String text) {
        assertEquals(text, dragAndDropPage.getFiveThousands().getText());
        dragAndDropPage.fiveThousandToCreditAmount();
    }

    @Then("success message Perfect is shown")
    public void successPerfectMessageIsShown() {
        assertTrue(dragAndDropPage.isPerfectMessagePresent());
    }

}
