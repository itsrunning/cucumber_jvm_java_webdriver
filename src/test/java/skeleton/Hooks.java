package skeleton;

import DAO.MicroBlogDao;
import DAO.UserDao;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.skife.jdbi.v2.DBI;

public class Hooks extends BaseStep {
    @Before
    public void setup() throws SQLException {
        if(driver == null){
            driver = new FirefoxDriver();
        }
        openConnections();
    }

    private void openConnections() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
        DBI dbi = new DBI(
                "jdbc:postgresql://localhost:5432/microblog",
                "joe",
                "joe");
        dbi.open();
        user = dbi.open(UserDao.class);
        microBlog = dbi.open(MicroBlogDao.class);
        user.deleteAll();
        microBlog.deleteAll();
    }

    @After
    public void closeConnections(){
        user.deleteAll();
        microBlog.deleteAll();
        user.close();
        microBlog.close();
    }



}
