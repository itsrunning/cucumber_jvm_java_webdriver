package skeleton.pages;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import skeleton.BaseStep;

import java.util.List;

public class NewUserPage  extends BaseStep{

    @When("^I navigate to create new User$")
    public void i_navigate_to_create_new_User() throws Throwable {
        driver.findElementByLinkText("Create New User").click();
    }


    @When("^create new user name (.*)$")
    public void create_new_user_name_deepak(String name) throws Throwable {
        getElement("[type=text]").sendKeys(name);
        getElement("[type=submit]").click();
    }

    @When("^I navigate to all users page$")
    public void i_navigate_to_all_users_page() throws Throwable {
        driver.get("http://localhost:8080/users/all");
    }

    @Then("^I see the following users$")
    public void i_see_the_following_users(DataTable users) throws Throwable {
        List<String> usersNames = users.asList(String.class);
        int size = usersNames.size();
        for(int index = 1; index<size; index++){
            Assert.assertEquals(getElement("tr:nth-of-type("+ (index+1) +") .name").getText(),usersNames.get(index));
        }
    }

}
