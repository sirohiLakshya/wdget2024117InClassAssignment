package tests.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpTestActions {
    public static void openSiginPage(WebDriver driver, String signInPageUrl){
        driver.get(signInPageUrl);
    }

    public static void fillDetails(WebDriver driver, String firstName, String lastName, String email, String tele, String password){
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys(tele);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.id("input-confirm")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

        System.out.println("Sign Complete!");

        try{
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
    }
}
