package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolymerPage extends BasePage{

    @FindBy(css = "[id='new-todo']")
    public WebElement todoAddBox;

    @FindBy(xpath = "(//label[@class='style-scope td-item'])[2]")
    public WebElement secondItem;

    @FindBy(id = "edit")
    public WebElement editItem;

}
