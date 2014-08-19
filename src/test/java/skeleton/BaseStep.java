package skeleton;

import DAO.MicroBlogDao;
import DAO.UserDao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseStep{
    public static FirefoxDriver driver = null;
    public static UserDao user = null;
    public static MicroBlogDao microBlog = null;

    protected WebElement getElement(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }


}
