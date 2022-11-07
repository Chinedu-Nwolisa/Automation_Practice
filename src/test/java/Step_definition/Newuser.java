package Step_definition;

import Pages.PageObjModelCreateNewUser;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Newuser {
    public WebDriver driver;
    public int random;

    @Given("^i get on the home screen$")
    public void iGetOnTheHomeScreen() {
        System.setProperty("webdriver.chrome.driver", "/Users/ned/Desktop/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^i get on the login screen$")
    public void iGetOnTheLoginScreen() {
        PageObjModelCreateNewUser page = PageFactory.initElements(driver, PageObjModelCreateNewUser.class);
        page.ClickSignInLink();
    }

    @And("^i enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() throws InterruptedException {
        PageObjModelCreateNewUser page = PageFactory.initElements(driver, PageObjModelCreateNewUser.class);
        page.CreateNewUserEmailAddress();
    }

    @And("^i click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
        PageObjModelCreateNewUser page = PageFactory.initElements(driver, PageObjModelCreateNewUser.class);
        page.ClickOnCreateAccountButton();
    }

    @When("^i enter all required details$")
    public void iEnterAllRequiredDetails() {
        PageObjModelCreateNewUser page = PageFactory.initElements(driver, PageObjModelCreateNewUser.class);
        page.ClickOnMaleGenderButton();
        page.EnterCustomerFirstName();
        page.EnterCustomerLastName();
        page.EnterPassword();
        page.SelectDobDay();
        page.SelectDobMonth();
        page.SelectDobYear();
        page.ClickNewsLetter();
        page.ClickSpecialOffers();
        page.EnterCustomerAddress();
        page.CustomerCity();
        page.EnterCustomerState();
        page.EnterPostCode();
        page.EnterPhoneNumber();
        page.AliasAddress();
    }

    @And("^i click the register button$")
    public void iClickTheRegisterButton() {
        PageObjModelCreateNewUser page = PageFactory.initElements(driver, PageObjModelCreateNewUser.class);
        page.ClickTheRegisterButton();
    }

    @Then("^my account should be created successfully$")
    public void myAccountShouldBeCreatedSuccessfully() {
        PageObjModelCreateNewUser page = PageFactory.initElements(driver, PageObjModelCreateNewUser.class);
        page.AccountShouldBeCreatedSuccessfully();
        driver.quit();
    }

}
