package tests.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutAction {
    public static void checkout(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
        System.out.println("Checked out successfully!");
    }
}
