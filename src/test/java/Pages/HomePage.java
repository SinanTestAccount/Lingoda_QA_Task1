package Pages;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(css = "[role='tab']")
    public List<WebElement> titleList;

    @FindBy(xpath = "//a[contains(text(),'Polymer')]")
    public WebElement polymer;

    @FindBy(xpath = "//header//h3")
    public WebElement header;

    public void examplesTitle(String title) throws InterruptedException {
        for (WebElement webElement : titleList) {

            if (webElement.getText().equals(title)){
                webElement.click();
                Thread.sleep(3000);
            }
        }
    }

}
