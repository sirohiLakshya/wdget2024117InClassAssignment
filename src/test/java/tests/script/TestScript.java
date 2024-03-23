package tests.script;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.actions.*;

import java.io.FileInputStream;
import java.io.IOException;

public class TestScript {
    WebDriver driver;
    @Test
    public void testScript() throws IOException {
        driver = new ChromeDriver();
        FileInputStream file = new FileInputStream("utils\\KeyWords.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rows = sheet.getLastRowNum();

        for(int row=1;row<=rows;row++){
            XSSFRow rowData = sheet.getRow(row);
            String currAction = rowData.getCell(1).toString().toLowerCase();
            if(currAction.equals("registerUser".toLowerCase())){
                SignUpTestActions.openSiginPage(driver,"https://tutorialsninja.com/demo/index.php?route=account/register");
                SignUpTestActions.fillDetails(driver, "Laskhya", "Kumar","temp10012345677@gmail.com","7901220000","password123");
            }else if(currAction.equals("logOut".toLowerCase())){
                LogOutTestActions.logout(driver);
            }else if(currAction.equals("login".toLowerCase())){
                LoginTestActions.openBrowser(driver,"https://tutorialsninja.com/demo/index.php?route=account/login");
                LoginTestActions.enterUserName(driver,"temp10012345677@gmail.com","//*[@id=\"input-email\"]");
                LoginTestActions.enterPassword(driver,"password123","//*[@id=\"input-password\"]");
                LoginTestActions.clickLogInButton(driver,"//*[@id=\"content\"]/div/div[2]/div/form/input");
            }else if(currAction.equals("addToCart".toLowerCase())){
                AddProductToCartActions.selectCategory(driver);
                AddProductToCartActions.chooseProduct(driver);
                AddProductToCartActions.addToCart(driver);
                AddProductToCartActions.openCart(driver);
            }else if(currAction.equals("checkout".toLowerCase())) {
                CheckoutAction.checkout(driver);
            }else if(currAction.equals("validation".toLowerCase())) {
                String expectedTitle = "Shopping Cart";
                String actualTitle = driver.getTitle();
                Assert.assertEquals(expectedTitle,actualTitle);
            }
        }
    }
}
