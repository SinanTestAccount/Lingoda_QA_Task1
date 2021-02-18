package StepDefinitions;

import Pages.HomePage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class HomePageStepDefinitions {

    @Given("User should load to website")
    public void user_should_load_to_website() {
        Driver.getdriver().get(ConfigurationReader.get("url"));
        Driver.getdriver().manage().window().maximize();
        Driver.getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("User should click {string} tab")
    public void user_should_click_tab(String title) throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.examplesTitle(title);

    }

    @When("User should select Polymer link")
    public void user_should_select_link() {

        HomePage homePage = new HomePage();
        homePage.polymer.click();
        Driver.getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("User should see {string} page")
    public void user_should_see_page(String header) {

        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.header.getText(),header);
    }
}
