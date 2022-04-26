import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Activities_7 {

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver;
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            WebDriver.Timeouts timeouts = driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.get("http://alchemy.hguy.co/orangehrm");
            driver.findElement(By.id("txtUsername")).sendKeys("orange");
            driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
            driver.findElement(By.id("btnLogin")).click();
            driver.findElement(By.id("menu_pim_viewMyDetails")).click();
            driver.findElement(By.xpath("(//a[text() ='Qualifications'])[2]")).click();
            driver.findElement(By.id("addWorkExperience")).click();
            driver.findElement(By.id("experience_employer")).sendKeys("IBM");
            driver.findElement(By.id("experience_jobtitle")).sendKeys("Test Specialist");
            driver.findElement(By.id("btnWorkExpSave")).click();
            Thread.sleep(9999);
            driver.close();
        }
}

