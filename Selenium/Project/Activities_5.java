import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class Activities_5 {
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
        driver.findElement(By.id("btnSave")).click();
        WebElement fn =  driver.findElement(By.id("personal_txtEmpFirstName"));
        fn.clear();
        fn.sendKeys("Rama");
        WebElement ln =  driver.findElement(By.id("personal_txtEmpLastName"));
        ln.clear();
        ln.sendKeys("Prabhu");
        WebElement Eid = driver.findElement(By.id("personal_txtEmployeeId"));
        Eid.clear();
        Eid.sendKeys("0026BK");
        WebElement MS = driver.findElement(By.id("personal_cmbMarital"));
        Select dropdown = new Select(MS);
        dropdown.selectByVisibleText("Married");
        //Select ms = new Select(driver.findElement(By.name("personal_cmbMarital")));
        //ms.selectByVisibleText("Married");
        WebElement DOB=driver.findElement(By.id("personal_DOB"));
        DOB.clear();
        DOB.sendKeys("1978-03-03");
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(9999);
        driver.close();
    }
}
