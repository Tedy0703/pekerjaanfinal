package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class WebPage {

    By input_username = By.id("user-name");
    By input_pwd = By.id("password");

    By input_firstname = By.id("first-name");

    By input_lastname = By.id("last-name");

    By input_postalcode = By.id("postal-code");

    By btn_login = By.id("login-button");

    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");

    By icon_cart_item = By.xpath("//span[@class='shopping_cart_badge']");

    By addToCart = By.xpath("(//*[text()='Add to cart'])[1]");

    By removeToCart = By.xpath("(//*[text()='Remove'])[1]");
    By listfilterbarang = By.xpath("(//select[@class='product_sort_container'])[1]");

    By pilihlistfilterbarang = By.xpath("(//option[@value='hilo'])[1]");

    By chosecheckout = By.xpath("//button[@id='checkout']");



    By chosecontinue = By.xpath("//*[@id='continue']");

    By chosefinish = By.xpath("//*[@id='finish']");

    By chosecancel = By.xpath("//*[@id='cancel']");

    By continueshopping = By.xpath("//*[@id='continue-shopping']");

    //*[@id="cancel"]

    By error_msg(String msg) {
        return By.xpath("//*[contains(text (), '" + msg + "')]");
    }

    public void openBrowser() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPwd(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnlogin() {
        driver.findElement(btn_login).click();
    }

    public void assertHomePage() {
        driver.findElement(icon_cart).isDisplayed();
    }

    public void assertErrMsg(String errormsg) {
        driver.findElement(error_msg(errormsg)).isDisplayed();
    }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void removeToCart() {
        driver.findElement(removeToCart).click();
    }

    public void assertCartItem(String cartItem) {
        String itemExpected = cartItem;
        String itemActual = driver.findElement(icon_cart_item).getText();
        Assertions.assertThat(itemActual).isEqualTo(itemExpected);

//        driver.findElement(icon_cart_item).getText();
    }

    public void listfilterbarang() throws InterruptedException {
        driver.findElement(listfilterbarang).click();
        Thread.sleep(1000);

    }

    public void pilihlistfilterbarang() throws InterruptedException {
        driver.findElement(pilihlistfilterbarang).click();
        Thread.sleep(1000);

    }

    public void pilihiconcart() throws InterruptedException {
        driver.findElement(icon_cart).click();
        Thread.sleep(1000);
    }
    public void pilihcheckout() throws InterruptedException {
        driver.findElement(chosecheckout).click();
        Thread.sleep(1000);
    }
    public void inputFirstname(String firstname) {
        driver.findElement(input_firstname).sendKeys(firstname);

    }
    public void inputLastname(String lastname) {
        driver.findElement(input_lastname).sendKeys(lastname);

    }
    public void inputPostalcode(String postalcode) {
        driver.findElement(input_postalcode).sendKeys(postalcode);
    }
    public void chosecontinue() {
        driver.findElement(chosecontinue).click();
    }
    public void chosefinish() {
        driver.findElement(chosefinish).click();
    }
    public void setChosecancel() {
        driver.findElement(chosecancel).click();
    }
    public void setContinueshopping() {
        driver.findElement(continueshopping).click();
    }
}