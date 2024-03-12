package stepDef;

import Pages.WebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static helper.Utility.driver;

public class WebStep {

    WebPage webPage;

    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("open web login page")
    public void openWebLoginPage() {
        webPage.openBrowser();

    }

    @And("user input username{string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input password{string}")
    public void userInputPassword(String pwd) {
        webPage.inputPwd(pwd);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.clickBtnlogin();

    }

    @And("user will see icon cart in homepage")
    public void userWillSeeIconCartInHomepage() {
        webPage.assertHomePage();
    }

    @And("user will see err message {string}")
    public void userWillSeeErrMessage(String errMesg) {
    webPage.assertErrMsg(errMesg);
    }

    @And("user add item to cart")
    public void userAddItemToCart(){
        webPage.clickAddToCart();
    }



    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String cartItem) {
        webPage.assertCartItem(cartItem);
    }

    @And("user remove item to cart")
    public void userRemoveItemToCart() {
        webPage.removeToCart();
    }

    @Then("user chose filter goods")
    public void userChoseFilterGoods() throws InterruptedException {
       webPage.listfilterbarang();
    }

    @Then("chose filter high to low")
    public void choseFilterHighToLow() throws InterruptedException {
        webPage.pilihlistfilterbarang();
    }

    @And("chose cart")
    public void choseCart() throws InterruptedException {
        webPage.pilihiconcart();
    }

    @And("checkout")
    public void checkout() throws InterruptedException {
webPage.pilihcheckout();
    }


    @And("user input zipcode{string}")
    public void userInputZipcode(String postalcode) {
        webPage.inputPostalcode(postalcode);
    }

    @And("user input lastname{string}")
    public void userInputLastname(String lastname) {
        webPage.inputLastname(lastname);

    }

    @And("user input firstname{string}")
    public void userInputFirstname(String firstname) {
        webPage.inputFirstname(firstname);
    }

    @And("chose continue")
    public void choseContinue() {
        webPage.chosecontinue();
    }

    @Then("chose finish")
    public void choseFinish() {
    webPage.chosefinish();
    }

    @And("chose cancel")
    public void choseCancel() {
        webPage.setChosecancel();
    }

    @Then("user chose continue shopping")
    public void userChoseContinueShopping() {
        webPage.setContinueshopping();
    }
}
