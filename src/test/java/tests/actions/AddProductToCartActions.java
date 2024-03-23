package tests.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductToCartActions {
    public static void selectCategory(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click();
    }
    public static void chooseProduct(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
    }

    public static void addToCart(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        System.out.println("iMac added to cart!");
    }
    public static void openCart(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
    }
}
