package pages;

import Utils.EcommerceUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
//https://www.ontestautomation.com/using-the-loadablecomponent-pattern-for-better-page-object-handling-in-selenium/
public class HomePage extends LoadableComponent<HomePage> {
 private WebDriver driver;

    public HomePage(WebDriver webDriver) {
       this.driver = webDriver;
       driver.get("http://automationpractice.com/index.php");
    }

    @Override
    protected void isLoaded() throws Error {

    }
    protected void load() {

    }


}
