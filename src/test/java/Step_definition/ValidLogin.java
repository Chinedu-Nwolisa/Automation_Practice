package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
   public WebDriver driver;

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
       System.setProperty("webdriver.chrome.driver", "/Users/ned/Desktop/Drivers/chromedriver");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("http://automationpractice.com/index.php");
   }

    @When("^I click the sign in button$")
    public void iClickTheSignInButton() {
      driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
   }

    @And("^i enter valid username$")
    public void iEnterValidUsername() {
        driver.findElement(By.name("email")).sendKeys("nwolisachinedu2015@yahoo.com");
    }

    @And("^i enter valid password$")
    public void iEnterValidPassword() {
        driver.findElement(By.id("passwd")).sendKeys("Godson2015");
    }

    @When("^i click the login button$")
    public void iClickTheLoginButton() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        String ExpectedLoggedInUser = "Chinedu Nwolisa";
        String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
        driver.quit();

    }
}
