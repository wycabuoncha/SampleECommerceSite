package pages;

import Utils.EcommerceUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Clothes {


    private WebDriver driver;
    private EcommerceUtils ecommerceUtils;

    public Clothes(WebDriver webdriver) {
        this.driver = webdriver;
    }

    public WebElement getWomenBtn() {
       // return ecommerceUtils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Women\')]"),30);
        return  driver.findElement(By.xpath("//a[contains(text(),\'Women\')]"));

    }

    public WebElement getTshirtsBtn() {
        return driver.findElement(By.xpath("(//a[contains(text(),\'Dresses\')])[5]"));
    }

    public WebElement getDressesBtn() {

        return driver.findElement(By.xpath("(//a[contains(text(),\'Dresses\')])[5]"));
    }

    public WebElement getContactUsBtn() {
        return driver.findElement(By.linkText("Contact us"));
    }

    public WebElement getSignInLink() {
        return driver.findElement(By.linkText("Sign in"));
    }


    public WebElement getHomeLogoLink() {
        return driver.findElement(By.cssSelector(".logo"));
    }

    public void mouseoverWomen() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Women\')]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }

    public WebElement getCasualDressesBtn(){
        return  driver.findElement(By.xpath("xpath=//span[contains(.,'Casual Dresses')]"));
    }

    public WebElement getSummerDressesBtn(){
        return driver.findElement(By.linkText("linkText=Casual Dresses"));
    }

    public WebElement getEveningDressesBtn(){
        return null;
    }

    public void mouseOverAction(){
            WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Women\')]"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
    }


}





