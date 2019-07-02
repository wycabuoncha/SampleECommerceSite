import pages.Clothes;
import Utils.EcommerceUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class ClothesBtnsTest {

    private Clothes clothes;
    public WebDriver driver;
    private EcommerceUtils utils;
    private Actions action;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        utils = new EcommerceUtils(driver);
        clothes = new Clothes(driver);
        action = new Actions(driver);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(1382, 744));
    }



    @Test
    public void AddToCart(){

     Assert.assertTrue(clothes.getWomenBtn().isDisplayed());

    }
    @Test
    public void Test2(){
        Assert.assertTrue(clothes.getDressesBtn().isDisplayed());
        clothes.getDressesBtn().click();
    }

    @AfterClass
    public void tearDown() {
        //logout

        driver.quit();
    }








}