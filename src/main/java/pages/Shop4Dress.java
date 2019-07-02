package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shop4Dress {
    private static WebDriver driver;

    public static void  main(String[] args){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(1936, 1056));
        driver.findElement(By.xpath("(//a[contains(text(),\'Dresses\')])[5]")).click();
        driver.findElement(By.cssSelector(".cat_desc:nth-child(1)")).click();
       // assertThat(driver.findElement(By.cssSelector(".rte > p:nth-child(1)")).getText(), is("Find your favorites dresses from our wide choice of evening, casual or summer dresses!"));
        driver.findElement(By.cssSelector("li:nth-child(1) > h5")).click();
        //assertThat(driver.findElement(By.cssSelector("li:nth-child(1) .subcategory-name")).getText(), is("CASUAL DRESSES"));
        driver.findElement(By.cssSelector("li:nth-child(2) > h5")).click();
       // assertThat(driver.findElement(By.cssSelector("li:nth-child(2) .subcategory-name")).getText(), is("EVENING DRESSES"));
        driver.findElement(By.cssSelector("li:nth-child(3) > h5")).click();
        //assertThat(driver.findElement(By.cssSelector("li:nth-child(3) .subcategory-name")).getText(), is("SUMMER DRESSES"));
        driver.findElement(By.cssSelector("li:nth-child(1) > .subcategory-image .replace-2x")).click();
        driver.findElement(By.cssSelector(".content_scene_cat_bg")).click();
       // assertThat(driver.findElement(By.cssSelector(".category-name")).getText(), is("Casual Dresses"));
        driver.findElement(By.cssSelector(".product_img_link > .replace-2x")).click();
        driver.findElement(By.cssSelector("h1")).click();
       // assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Printed Dress"));
        driver.findElement(By.cssSelector(".our_price_display")).click();
       // assertThat(driver.findElement(By.id("our_price_display")).getText(), is("$26.00"));
        driver.findElement(By.cssSelector("#short_description_content > p")).click();
       // assertThat(driver.findElement(By.cssSelector("#short_description_content > p")).getText(), is("100% cotton double printed dress. Black and white striped top and orange high waisted skater skirt bottom."));
        driver.findElement(By.cssSelector(".exclusive > span")).click();
        driver.findElement(By.cssSelector("h2:nth-child(2)")).click();
       /// assertThat(driver.findElement(By.cssSelector("h2:nth-child(2)")).getText(), is("Product successfully added to your shopping cart"));
        driver.findElement(By.cssSelector(".layer_cart_cart")).click();
        driver.findElement(By.cssSelector(".layer_cart_cart")).click();
        driver.findElement(By.cssSelector(".button-medium > span")).click();
        driver.findElement(By.id("cart_title")).click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".page-heading")).click();
      //  assertThat(driver.findElement(By.cssSelector(".page-heading")).getText(), is("AUTHENTICATION"));
        driver.close();
    }
}
