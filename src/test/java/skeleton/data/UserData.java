package skeleton.data;
import DAO.User;
import cucumber.api.java.en.Given;
import skeleton.BaseStep;

public class UserData extends BaseStep {
    @Given("^I have a user called (.*)$")
    public void i_have_a_user_called_(String name) throws Throwable {
        user.create(new User(name));
    }
}

