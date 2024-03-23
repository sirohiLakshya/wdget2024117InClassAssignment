package tests.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutTestActions {
    public static void logout(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
        System.out.println("LogOut Successful!");
    }
}
