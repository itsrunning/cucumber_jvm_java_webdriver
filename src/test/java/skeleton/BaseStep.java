package skeleton;

import DAO.MicroBlogDao;
import DAO.UserDao;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseStep{
    public static FirefoxDriver driver = null;
    public static UserDao user = null;
    public static MicroBlogDao microBlog = null;
}
