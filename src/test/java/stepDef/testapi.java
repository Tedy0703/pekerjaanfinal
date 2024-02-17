package stepDef;
import Pages.testapipage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;


public class testapi {
    testapipage testapiPage;

    public testapi(){
        this.testapiPage = new testapipage();
    }




@Given("prepare url valid for {string}")
public void prepareUrlValidFor(String url) {
testapiPage.prepareUrlValidFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        testapiPage.hitApiGetListUsers();
//        System.out.println("step 2");
        
    }

    @Then("validation status coide is equals {int}")
    public void validationStatusCoideIsEquals(int status_code) {
        testapiPage.validationStatusCoideIsEquals(status_code);
//        System.out.println("step 3");
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        testapiPage.validationResponseBodyGetListUsers();
//        System.out.println("step 4");
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        testapiPage.validationResponseJsonWithJSONSchema(filename);
//        System.out.println("step 5");
    }


    @And("hit api get create users")
    public void hitApiGetCreateUsers() {
        testapiPage.hitApiPostCreateUsers();

    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        testapiPage.validationResponseBodyCreateUser();
    }

    @And("hit api delete now")
    public void hitApiDeleteNow() {
        testapiPage.hitApiDeleteUsers();

    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        testapiPage.hitApiUpdateUsers();
        
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
    }
}
