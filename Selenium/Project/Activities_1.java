import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activities_1{
    public static void main(String[] args) {
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;

        //Instantiating driver object and launching browser
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://alchemy.hguy.co/orangehrm");

//Get the title of the website.
        String actualTitle = driver.getTitle();
        System.out.println("Page Title as: " + actualTitle);

//Make sure it matches "OrangeHRM" exactly.
        String expectedTitle = "OrangeHRM";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");
        //closes the browser
        driver.close();
    }
}
