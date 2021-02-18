package StepDefinitions;

import Pages.PolymerPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PloymerPageStepDefinition {

    @Then("User should add two todo items")
    public void user_should_add_two_todo_items() throws InterruptedException {

        PolymerPage polymerPage = new PolymerPage();
        Thread.sleep(2000);

        polymerPage.todoAddBox.sendKeys(ConfigurationReader.get("item1"));
        Driver.getdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Actions actions = new Actions(Driver.getdriver());
        actions.sendKeys(Keys.ENTER).perform();

        Thread.sleep(3000);

        polymerPage.todoAddBox.sendKeys(ConfigurationReader.get("item2"));
        actions.sendKeys(Keys.ENTER).perform();

        Thread.sleep(3000);


    }

    @Then("User should be able to edit second item")
    public void user_should_be_able_to_edit_second_item() throws InterruptedException {

        PolymerPage polymerPage = new PolymerPage();
        Actions actions = new Actions(Driver.getdriver());
        actions.doubleClick(polymerPage.secondItem).perform();
        Thread.sleep(2000);
        actions.doubleClick(polymerPage.editItem).perform();
        Thread.sleep(2000);
        polymerPage.editItem.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        polymerPage.editItem.sendKeys(ConfigurationReader.get("edittedItem"),Keys.ENTER);
        Thread.sleep(2000);

        Driver.getdriver().quit();
    }
}
