import PageObjects.Clothes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShopWorkflowTest {
    protected  WebDriver driver;
    protected  Clothes clothes;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        clothes = new Clothes(driver);
    }


    @Test
    public void selectClothes(){
        driver.get("http://automationpractice.com/index.php");
        Assert.assertTrue(clothes.getWomenBtn().isDisplayed());
        //Assert.assertTrue(clothes.getTshirtsBtn().isDisplayed());
        Assert.assertTrue(clothes.getDressesBtn().isDisplayed());
        Assert.assertTrue(clothes.getContactUsBtn().isDisplayed());
        Assert.assertTrue(clothes.getSignInLink().isDisplayed());
        Assert.assertTrue(clothes.getHomeLogoLink().isDisplayed());
    }


    @AfterClass
    public void cleanUp(){

        //logout

        driver.quit();
    }
}
