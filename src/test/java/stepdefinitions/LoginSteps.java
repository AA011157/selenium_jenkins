package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver;

    @Given("user opens the browser")
    public void user_opens_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver.get(url);
    }

    @Then("page title should contain {string}")
    public void page_title_should_contain(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.contains(expectedTitle), "Title check failed!");
        driver.quit();
    }
}