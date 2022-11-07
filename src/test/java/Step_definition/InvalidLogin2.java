package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin2 {
    public WebDriver driver;

    @Given("^I get on the homepage$")
    public void iGetOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver", "/Users/ned/Desktop/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I press the sign in button$")
    public void iPressTheSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    }

    @When("^I enter the wrong username$")
    public void iEnterTheWrongUsername() {
        driver.findElement(By.name("email")).sendKeys("wolisachinedu2015@yahoo.com");
    }


    @And("^enter the correct password$")
    public void enterTheCorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("Godson2015");
    }

    @When("^I click on the button to login$")
    public void iClickOnTheButtonToLogin() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    @Then("^I should get the correct error message$")
    public void iShouldGetTheCorrectErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        driver.quit();
    }
}
