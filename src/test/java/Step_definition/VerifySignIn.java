package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySignIn {

    public WebDriver driver;
    @Given("^i get on the homepage$")
    public void iGetOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver", "/Users/ned/Desktop/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^i press the sign in button$")
    public void iPressTheSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    }

    @Then("^i should navigate to the sign in page successfully$")
    public void iShouldNavigateToTheSignInPageSuccessfully() {
        String ExpectedButton = "Sign in";
        String ActualButton = driver.findElement(By.id("SubmitLogin")).getText();
        Assert.assertEquals(ExpectedButton, ActualButton);
        System.out.println(ActualButton);
        driver.quit();
    }
}
