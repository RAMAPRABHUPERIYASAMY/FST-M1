import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class Activities_4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("http://alchemy.hguy.co/orangehrm");
        WebElement Username = driver.findElement(By.id("txtUsername"));
        Username.sendKeys("orange");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("orangepassword123");
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Rama");
        driver.findElement(By.id("lastName")).sendKeys("Prabhu");
        driver.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\0026BK744\\pas4.jpg");
        driver.findElement(By.id("chkLogin")).click();
        driver.findElement(By.id("user_name")).sendKeys("Ramaprabhu11");
        driver.findElement(By.id("user_password")).sendKeys("Welcome@01");
        driver.findElement(By.id("re_password")).sendKeys("Welcome@01");
        Select status = new Select(driver.findElement(By.name("status")));
        status.selectByVisibleText("Enabled");
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Rama"+ Keys.TAB);
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(9000);
        driver.close();

    }
}

