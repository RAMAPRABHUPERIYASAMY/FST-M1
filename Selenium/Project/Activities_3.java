import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activities_3 {



        public static void main(String[] args) throws InterruptedException {
            //Creating a driver object referencing WebDriver interface
            WebDriver driver;

            //Instantiating driver object and launching browser
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            WebDriver.Timeouts timeouts = driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.get("http://alchemy.hguy.co/orangehrm");

            WebElement divUsername = driver.findElement(By.id("txtUsername"));
            divUsername.sendKeys("orange");
            WebElement password = driver.findElement(By.id("txtPassword"));
            password.sendKeys("orangepassword123");
            WebElement login = driver.findElement(By.id("btnLogin"));

            login.click();

            Thread.sleep(5000);
            String welcome= driver.getTitle();
            System.out.println(welcome);

            driver.close();
        }
    }

