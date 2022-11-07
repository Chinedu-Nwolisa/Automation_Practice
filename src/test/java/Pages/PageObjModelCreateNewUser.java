package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PageObjModelCreateNewUser {

    public int random;

    //Declare your locators
    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email_create")
    public static WebElement CreateNewUserEmail;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitCreate")
    public static WebElement CreateAccountButton;

    @FindBy(how = How.ID_OR_NAME, using = "id_gender1")
    public static WebElement MaleGenderButton;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    public static WebElement CustomerFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    public static WebElement CustomerLastName;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement Password;

    @FindBy(how = How.ID_OR_NAME, using = "days")
    public static WebElement DobDays;

    @FindBy(how = How.ID_OR_NAME, using = "months")
    public static WebElement DobMonths;

    @FindBy(how = How.ID_OR_NAME, using = "years")
    public static WebElement DobYears;

    @FindBy(how = How.ID_OR_NAME, using = "newsletter")
    public static WebElement NewsLetter;

    @FindBy(how = How.ID_OR_NAME, using = "optin")
    public static WebElement SpecialOffers;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement City;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement State;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement PhoneNumber;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement AddressAlias;

    @FindBy(how = How.ID_OR_NAME, using = "submitAccount")
    public static WebElement RegisterButton;


    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public static WebElement LoggedInUser;



    //Declare your methods

    public void ClickSignInLink() {
        SignInLink.click();
    }

    public void CreateNewUserEmailAddress() {
        random = 100 + (int)(Math.random()* (1000-1) +1);
        CreateNewUserEmail.sendKeys("nwolisachinedu2022" + random + "@gmail.com");
    }

    public void ClickOnCreateAccountButton() throws InterruptedException {
        CreateAccountButton.click();
        Thread.sleep(8000);
    }

    public void ClickOnMaleGenderButton() {

        MaleGenderButton.click();
    }

    public void EnterCustomerFirstName() {
        CustomerFirstName.sendKeys("Ebuka");
    }

    public void EnterCustomerLastName() {
        CustomerLastName.sendKeys("Okoli");
    }

    public void EnterPassword() {
        Password.sendKeys("optimistic");
    }

    public void SelectDobDay() {
        Select day = new Select(DobDays);
        day.selectByIndex(19);
    }

    public void SelectDobMonth() {
        Select month = new Select(DobMonths);
        month.selectByValue("3");
    }

    public void SelectDobYear() {
        Select year = new Select(DobYears);
        year.selectByValue("1992");
    }

    public void ClickNewsLetter() {
        NewsLetter.click();
    }

    public void ClickSpecialOffers() {
        SpecialOffers.click();
    }

    public void EnterCustomerAddress() {
        Address.sendKeys("Umuoji Street");
    }

    public void CustomerCity() {
        City.sendKeys("Memphis");
    }

    public void EnterCustomerState() {
        Select state = new Select(State);
        state.selectByVisibleText("Texas");
    }

    public void EnterPostCode() {
        Postcode.sendKeys("22876");
    }

    public void EnterPhoneNumber() {
        PhoneNumber.sendKeys("0468482697");
    }

    public void AliasAddress() {
        AddressAlias.sendKeys("Onitsha");
    }

    public void ClickTheRegisterButton() {
        RegisterButton.click();
    }

    public void AccountShouldBeCreatedSuccessfully() {
        LoggedInUser.getText();
    }

}
