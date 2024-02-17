package stepDef;

import Pages.WebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

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
}
