package Pages;

import org.openqa.selenium.By;
import static helper.Utility.driver;
public class WebPage {

    By input_username = By.id("user-name");
    By input_pwd = By.id("password");

    By btn_login = By.id("login-button");

    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");

    By error_msg(String msg) {
        return By.xpath("//*[contains(text (), '"+msg+  "')]");
    }

    public void openBrowser() {
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }
    public void inputPwd(String pwd){
        driver.findElement(input_pwd).sendKeys(pwd);
    }
    public void clickBtnlogin() {
        driver.findElement(btn_login).click();
    }
    public void assertHomePage(){
        driver.findElement(icon_cart).isDisplayed();
    }
    public void assertErrMsg(String errormsg){
        driver.findElement(error_msg(errormsg)).isDisplayed();
    }
}