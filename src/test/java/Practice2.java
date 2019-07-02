import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {
    private static WebDriver driver;

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(1382, 744));
        {
            WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Women\')]"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Casual Dresses")).click();
        driver.findElement(By.cssSelector(".cat_desc")).click();
        //assertThat(driver.findElement(By.cssSelector(".category-name")).getText(), is("Casual Dresses"));
        {
            WebElement element = driver.findElement(By.cssSelector(".product_img_link > .replace-2x"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
        driver.findElement(By.cssSelector(".continue > span")).click();
    }
}
