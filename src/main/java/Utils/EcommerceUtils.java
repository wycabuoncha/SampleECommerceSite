package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceUtils {
private WebDriver driver ;
    public EcommerceUtils(WebDriver webdriver) {
        this.driver = webdriver;
    }

    //check if elements is clickable
    public boolean isElementClickable(WebElement clickableElmnt, WebDriver driver){


        try {
            WebDriverWait wait = new WebDriverWait(driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(clickableElmnt));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public WebElement waitForElementPresence(WebDriver driver, By selector, int waitInterval) {
        WebElement element = (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.presenceOfElementLocated(selector));
        return element;
    }
}
