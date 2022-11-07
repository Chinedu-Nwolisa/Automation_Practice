package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin1 {
    public WebDriver driver;

    @Given("^I am on the landing page$")
    public void iAmOnTheLandingPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/ned/Desktop/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I select the sign in link$")
    public void iSelectTheSignInLink() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    }

    @And("^I enter the correct username$")
    public void iEnterTheCorrectUsername() {
        driver.findElement(By.name("email")).sendKeys("nwolisachinedu2015@yahoo.com");
    }

    @And("^I enter incorrect password$")
    public void iEnterIncorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("godson2015");
    }

    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    @Then("^i should get the correct error message$")
    public void iShouldGetTheCorrectErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        driver.quit();
    }


}
