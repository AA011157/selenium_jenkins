package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;

    @Given("user opens the browser")
    public void user_opens_the_browser() {
        driver = new ChromeDriver();
    }

    @When("user navigates to {string}")
    public void user_navigates_to(String url) {
        driver.get(url);
    }

    @Then("page title should contain {string}")
    public void page_title_should_contain(String expected) {
        if (!driver.getTitle().contains(expected)) {
            throw new AssertionError("Title does not match");
        }
        
    }
}