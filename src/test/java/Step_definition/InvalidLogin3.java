package Step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin3 {

    public WebDriver driver;
    @Given("^I land on the homepage$")
    public void iLandOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver", "/Users/ned/Desktop/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I click on the sign in button$")
    public void iClickOnTheSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    }

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String Username) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(Username);

    }

    @And("^I input \"([^\"]*)\"$")
    public void iInput(String Password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(Password);
    }

    @When("^I click on the  login$")
    public void iClickOnTheLogin() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    @Then("^I should get the correct \"([^\"]*)\"$")
    public void iShouldGetTheCorrect(String error) throws Throwable {
        String ExpectedErrorMessage = error;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        driver.quit();

    }
}
